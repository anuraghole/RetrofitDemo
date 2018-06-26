package com.example.aurag.gitlabdemo;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface ServiceUser {
    @FormUrlEncoded
    @POST("/project1/Webservices/registration.php")
    Call<UserPojo> getTopRatedMovies(@Field("Email") String email,
                                     @Field("Mobile") String mob,
                                     @Field("Name") String name,
                                     @Field("Password") String pwd);

}
