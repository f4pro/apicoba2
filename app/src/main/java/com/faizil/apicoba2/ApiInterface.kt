package com.faizil.apicoba2

import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {
    @GET("pegawai")
    fun getData(): Call<List<ListDataItem>>
}