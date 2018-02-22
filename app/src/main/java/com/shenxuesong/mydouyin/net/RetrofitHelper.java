package com.shenxuesong.mydouyin.net;


import com.shenxuesong.mydouyin.BuildConfig;
import com.shenxuesong.mydouyin.net.interceptor.HttpCommonParamsInterceptor;
import com.shenxuesong.mydouyin.net.param.QueryParam;

import java.util.Map;

import me.jessyan.retrofiturlmanager.RetrofitUrlManager;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;


public class RetrofitHelper {

    private static Retrofit retrofit;

    static {
        initRetrofit(API.HOSTURL);
    }

    /**
     * 获取OkHttpClient
     *
     * @return
     */
    private static OkHttpClient getOkHttpClient() {

        //TODO 处理拦截器，自定义缓存，HTTP的一些参数设置
        OkHttpClient.Builder builder = RetrofitUrlManager
                .getInstance()
                .with(new OkHttpClient.Builder()) //RetrofitUrlManager 初始化
//                .readTimeout(30, TimeUnit.SECONDS)
//                .connectTimeout(30, TimeUnit.SECONDS)
                ;


        //只有再开发版本才打印log日志
        if (BuildConfig.DEBUG) {
            //TODO 日志拦截器
            builder.addInterceptor(new HttpLoggingInterceptor());
        }

        try {
            Map<String,String> map= ObjectUtils.objectToMap(new QueryParam());//将类型转化为map集合
            HttpCommonParamsInterceptor commonParamsInterceptor = new HttpCommonParamsInterceptor.Builder()
                    .type(HttpCommonParamsInterceptor.Builder.Type.QUERY_STRING)
                    .params(map)
                    .build();
            builder.addInterceptor(commonParamsInterceptor);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        return builder.build();
    }

    /**
     * 初始化Retrofit
     *
     * @param url
     */
    private static void initRetrofit(String url) {
        if (retrofit == null) {
            synchronized (Retrofit.class) {
                if (retrofit == null) {
                    retrofit = new Retrofit.Builder()
                            .baseUrl(url)
                            .client(getOkHttpClient())
                            .addConverterFactory(GsonConverterFactory.create())
                            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                            .build();
                }
            }
        }
    }

    public static ServiceAPI getServiceAPI() {
        return createAPI(ServiceAPI.class);
    }

  /*  public static SNSAPI getSNSAPI() {
        return createAPI(SNSAPI.class);
    }*/

    private static <T> T createAPI(Class<T> clzss) {
        return retrofit.create(clzss);
    }

}
