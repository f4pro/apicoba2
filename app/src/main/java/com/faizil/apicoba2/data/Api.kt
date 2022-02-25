package com.faizil.apicoba2.data

import com.faizil.apicoba2.PostResponseItem
import retrofit2.Call
import retrofit2.http.GET

interface Api {
    @GET("pegawai")
    fun getPosts(): Call<ArrayList<PostResponseItem>>
}