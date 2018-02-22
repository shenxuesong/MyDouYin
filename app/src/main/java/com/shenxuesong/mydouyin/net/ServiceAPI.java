package com.shenxuesong.mydouyin.net;


import com.shenxuesong.mydouyin.Bean.SearchBean;

import java.util.Map;

import io.reactivex.Flowable;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

public interface ServiceAPI {
 @GET("/aweme/v1/hot/search/")
    Flowable<SearchBean> doSearch(@QueryMap Map<String, String> map);
}
