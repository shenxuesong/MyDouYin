package com.shenxuesong.mydouyin.View.Personalhomepage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.shenxuesong.mydouyin.HotBean.HotBean;
import com.shenxuesong.mydouyin.Iview.IHot;
import com.shenxuesong.mydouyin.R;
import com.shenxuesong.mydouyin.presenter.HotPresenter;

public class PersonalHomePageActivity extends AppCompatActivity implements IHot {

    private HotPresenter hotPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_home_page);
        hotPresenter = new HotPresenter(this);
        hotPresenter.getHotPersenter(20);
    }


    @Override
    public void showHotBean(HotBean hotBean) {
        hotBean.getCategory_list();
    }

    /**
     * 进行Mvp 的解绑
     */
    @Override
    protected void onDestroy() {
        super.onDestroy();
        hotPresenter.jieBangHotPersenter();
        hotPresenter=null;
    }
}
