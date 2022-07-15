package com.example.a10119186latihan7;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Pahlawan {
    @GET("/api/heroes")
    Call<List<Post>> getPost();
}