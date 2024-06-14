package com.example.loginsignup;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface APIInterface {

    @FormUrlEncoded
    @POST("api/login")
//    Call<ResponseModel> login(@Body RequestModel requestModel);
    Call<ResponseModel> login(
            @Field("email") String email,
            @Field("password") String password);
}
