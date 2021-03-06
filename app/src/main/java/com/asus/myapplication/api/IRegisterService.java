package com.asus.myapplication.api;

import com.asus.myapplication.model.RegisterBean;
import java.util.Map;
import retrofit2.Call;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by 钟光新 on 2016/6/4 0004.
 */
public interface IRegisterService {
    @FormUrlEncoded
    @POST("RegisterDataServlet")
    Call<RegisterBean> createUser(@FieldMap Map<String ,String> params);
}
