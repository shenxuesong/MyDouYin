package com.shenxuesong.mydouyin.Model;

import com.shenxuesong.mydouyin.Bean.SearchBean;
import com.shenxuesong.mydouyin.net.RetrofitHelper;
import com.shenxuesong.mydouyin.net.SuccessfulFailureInterface;

import java.util.HashMap;
import java.util.Map;

import io.reactivex.Flowable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by Dell on 2018/2/22.
 */

public class SearchModel {
    /**
     * 搜索页面
     */
    public void doSearch( final SuccessfulFailureInterface<SearchBean> cgsb) {
        Map<String, String> map = new HashMap<>();
        // _rticket=1516849735338&as=a185f4765754ca2a395107&cp=4348ab517e966ba8e1grmh&mas=00f0e8f97bdd1c96dcdfedefc70dc26152ec0c8cac9ccc864c86c6
        map.put(" _rticket", "1516849735338");

        map.put("as", "a185f4765754ca2a395107");
        map.put("cp", "4348ab517e966ba8e1grmh");

        map.put("mas", "00f0e8f97bdd1c96dcdfedefc70dc26152ec0c8cac9ccc864c86c6");

        Flowable<SearchBean> flowable = RetrofitHelper.getServiceAPI().doSearch(map);
        flowable.observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(new Consumer<SearchBean>() {
                    @Override
                    public void accept(SearchBean searchBean) throws Exception {
                        cgsb.cgsb(searchBean);
                    }
                });
    }


}
