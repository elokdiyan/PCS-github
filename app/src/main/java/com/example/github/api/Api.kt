package com.example.github.api


import com.example.github.data.model.DetailUserResponse
import com.example.github.data.model.User
import com.example.github.data.model.UserResponse
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query
import retrofit2.Call
import retrofit2.http.Path

interface Api {
    @GET("search/users")
    @Headers("Authorization: token a07fdaad29f25ff2e0dec93892a7c02b1835f1cc")
    fun getSearchUsers(
            @Query("q") query: String
    ): Call<UserResponse>

    @GET("users/{username}")
    @Headers("Authorization: token a07fdaad29f25ff2e0dec93892a7c02b1835f1cc")
    fun getUserDetail(
            @Path("username") username: String
    ): Call<DetailUserResponse>

    @GET("users/{username}/followers")
    @Headers("Authorization: token a07fdaad29f25ff2e0dec93892a7c02b1835f1cc")
    fun getFollowers(
            @Path("username") username: String
    ): Call<ArrayList<User>>

    @GET("users/{username}/following")
    @Headers("Authorization: token a07fdaad29f25ff2e0dec93892a7c02b1835f1cc")
    fun getFollowing(
            @Path("username") username: String
    ): Call<ArrayList<User>>
}