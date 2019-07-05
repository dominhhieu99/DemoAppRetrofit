package com.example.admin.app1;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JsonPlaceHolderApi {
    @GET("/api/users")
    Call<User> getUser();



}
