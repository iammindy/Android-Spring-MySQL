package com.example.myapplication;

import java.util.HashMap;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.FieldMap;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface Retrofit_interface {

    @GET("Member/all")
    Call<List<Member>> getMembers();

}