package com.shenxuesong.mydouyin.Model;

import com.shenxuesong.mydouyin.HotBean.HotBean;
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

public class HotModel {
    public void getHotBean(int count, final SuccessfulFailureInterface<HotBean> cgsb){
        Flowable<HotBean> flowable = RetrofitHelper.getServiceAPI().getPhotos(0+"", count+"");
        flowable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<HotBean>() {
                    @Override
                    public void accept(HotBean hotBean) throws Exception {
                        cgsb.cgsb(hotBean);
                    }
                });
    }
}
