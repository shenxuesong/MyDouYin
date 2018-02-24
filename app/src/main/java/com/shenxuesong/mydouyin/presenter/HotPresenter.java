package com.shenxuesong.mydouyin.presenter;

import com.shenxuesong.mydouyin.HotBean.HotBean;
import com.shenxuesong.mydouyin.Iview.IHot;
import com.shenxuesong.mydouyin.Model.HotModel;
import com.shenxuesong.mydouyin.net.SuccessfulFailureInterface;

/**
 * Created by Dell on 2018/2/22.
 */

public class HotPresenter {

    private  HotModel hotModel;
    private IHot iHot;
    public HotPresenter(IHot iHot) {
        hotModel = new HotModel();
        this.iHot=iHot;
    }
    public void getHotPersenter(int count){
        hotModel.getHotBean(count, new SuccessfulFailureInterface<HotBean>() {
            @Override
            public void cgsb(HotBean hotBean) {
               iHot.showHotBean(hotBean);
            }
        });
    }
    public void jieBangHotPersenter(){
        hotModel=null;
    }
}
