package com.shenxuesong.mydouyin.presenter;

import com.shenxuesong.mydouyin.SearchBean.SearchBean;
import com.shenxuesong.mydouyin.Iview.Isearch;
import com.shenxuesong.mydouyin.Model.SearchModel;
import com.shenxuesong.mydouyin.net.SuccessfulFailureInterface;

/**
 * Created by Dell on 2018/2/22.
 */

public class SearchPresenter {

    private SearchModel searchModel;
     private Isearch isearch;
    public SearchPresenter(Isearch isearch) {
        searchModel = new SearchModel();
        this.isearch=isearch;

    }

    public  void getSearch(){
        searchModel.doSearch(new SuccessfulFailureInterface<SearchBean>() {
            @Override
            public void cgsb(SearchBean searchBean) {
              isearch.showBean(searchBean);
            }
        });
    }
    public void jB(){
        searchModel=null;
    }
}
