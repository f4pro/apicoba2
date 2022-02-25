package com.faizil.apicoba2.data

import com.faizil.apicoba2.PostResponseItem
import retrofit2.Call
import retrofit2.http.*

interface Api {
    @GET("pegawai")
    fun getPosts(): Call<ArrayList<PostResponseItem>>
/*
    @POST("pegawai")
    fun createPost(
        @Field("nama") name: String,
        @Field("provinsi") prov: Int,
        @Field("kabupaten")kab: Int,
        @Field("kelurahan")kel: Int
    ): Call<CreatePostResponse>
*/
    @DELETE("pegawai/{id}")
    fun deletePost(@Path("id") id: Int): Call<Void>
}