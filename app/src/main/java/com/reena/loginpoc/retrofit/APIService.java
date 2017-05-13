package com.reena.loginpoc.retrofit;

import com.reena.loginpoc.UserLogin;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import rx.Observable;

/**
 * Created by RA on 5/5/2017.
 */

public interface APIService {
    @POST("Your Endpoint")
    @FormUrlEncoded
    Observable<UserLogin> loginUser(@Field("username") String username,
                                    @Field("password") String password,
                                    @Field("client_id") String client_id,
                                    @Field("client_secret") String client_secret,
                                    @Field("grant_type") String grant_type,
                                    @Field("scope") String scope);
}
