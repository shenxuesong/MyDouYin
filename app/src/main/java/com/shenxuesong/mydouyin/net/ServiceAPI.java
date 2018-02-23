package com.shenxuesong.mydouyin.net;


import com.shenxuesong.mydouyin.BannerBean.BannerBean;
import com.shenxuesong.mydouyin.HotBean.HotBean;
import com.shenxuesong.mydouyin.SearchBean.SearchBean;

import java.util.Map;

import io.reactivex.Flowable;
import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

public interface ServiceAPI {
    /**
     * 获取热门搜索
     * @param map
     * @return
     */
   @GET("/aweme/v1/hot/search/")
    Flowable<SearchBean> doSearch(@QueryMap Map<String, String> map);
    /**
     * Banner图
     */
    @GET("/aweme/v1/find/")
    Flowable<BannerBean> getBannerUrl(@Query( "aiid")String aiid);
    /**
     * 热门
     */
    @GET("/aweme/v1/category/list/")
    Flowable<HotBean> getPhotos(@Query("cursor")String cursor,@Query("count")String count);
}
