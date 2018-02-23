package com.shenxuesong.mydouyin.Model;

import com.shenxuesong.mydouyin.BannerBean.BannerBean;
import com.shenxuesong.mydouyin.net.RetrofitHelper;
import com.shenxuesong.mydouyin.net.SuccessfulFailureInterface;

import io.reactivex.Flowable;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by Dell on 2018/2/22.
 */

public class BannerModel {
   public void getBanner(final SuccessfulFailureInterface<BannerBean> cgsb){
        Flowable<BannerBean> bannerUrl = RetrofitHelper.getServiceAPI().getBannerUrl("1128");
        bannerUrl.observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(new Consumer<BannerBean>() {
                    @Override
                    public void accept(BannerBean bannerBean) throws Exception {
                        cgsb.cgsb(bannerBean);
                    }
                });

    }
}
