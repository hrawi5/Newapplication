package com.asus.myapplication.api;

import com.asus.myapplication.model.News;
import com.asus.myapplication.util.BaseResp;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

/**
 * Created by 钟光新 on 2016/6/4 0004.
 */
public interface INewsService {
    @GET("NewsDataServlet")
    @Headers("Cache-Control: public, max-age=30")
    Call<BaseResp<News>> userNews(@Query("userId") String userId);
}
