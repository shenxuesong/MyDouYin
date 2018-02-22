package com.shenxuesong.mydouyin.View;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.shenxuesong.mydouyin.Bean.DataBean;
import com.shenxuesong.mydouyin.Bean.MusicBean;
import com.shenxuesong.mydouyin.Bean.SearchBean;
import com.shenxuesong.mydouyin.Iview.Isearch;
import com.shenxuesong.mydouyin.R;
import com.shenxuesong.mydouyin.persenter.SearchPersenter;

import java.util.List;

public class SearchActivity extends AppCompatActivity implements Isearch {
private SearchPersenter searchPersenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         searchPersenter = new SearchPersenter(this);
        searchPersenter.getSearch();
    }

    @Override
    public void showBean(SearchBean searchBean) {
        List<DataBean> data = searchBean.getData();
     

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        searchPersenter.jB();
        searchPersenter=null;
    }
}
