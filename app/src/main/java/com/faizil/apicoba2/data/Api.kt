package com.faizil.apicoba2.data

import com.faizil.apicoba2.PostResponseItem
import retrofit2.Call
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.Path

interface Api {
    @GET("pegawai")
    fun getPosts(): Call<ArrayList<PostResponseItem>>


    @DELETE("pegawai/{id}")
    fun deletePost(@Path("id")id: Int): Call<Void>
}