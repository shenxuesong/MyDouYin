package com.shenxuesong.mydouyin.persenter;

import com.shenxuesong.mydouyin.BannerBean.BannerBean;
import com.shenxuesong.mydouyin.Iview.IBanner;
import com.shenxuesong.mydouyin.Model.BannerModel;
import com.shenxuesong.mydouyin.net.SuccessfulFailureInterface;

/**
 * Created by Dell on 2018/2/22.
 */

public class BannerPersenter {

    private  BannerModel bannerModel;
    private IBanner iBanner;
    public BannerPersenter(IBanner iBanner) {
         bannerModel = new BannerModel();
         this.iBanner=iBanner;
    }
    public void getBannerBean(){
        bannerModel.getBanner(new SuccessfulFailureInterface<BannerBean>() {
            @Override
            public void cgsb(BannerBean bannerBean) {
                iBanner.showBanner(bannerBean);
            }
        });
    }

    public void jieBang(){
        bannerModel=null;
    }
}
