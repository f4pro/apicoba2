package com.faizil.apicoba2

import android.os.Bundle
import android.util.Log.d
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.lang.StringBuilder

const val BASE_URL = "https://61601920faa03600179fb8d2.mockapi.io/"
class MainActivity : AppCompatActivity() {
    lateinit var linearLayoutManager: LinearLayoutManager

    private val list = ArrayList<PostResponseItem>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        data_rv.setHasFixedSize(true)
        linearLayoutManager = LinearLayoutManager(this)

        RetrofitClient.instance.getPosts().enqueue(object: Callback<ArrayList<PostResponseItem>>{
            override fun onResponse(
                call: Call<ArrayList<PostResponseItem>>,
                response: Response<ArrayList<PostResponseItem>>
            ) {
                val responseCode = response.code().toString()
                codeTV.text = responseCode
                response.body()?.let { list.addAll(it) }
                val adapter = PostAdapter(list)
                data_rv.adapter = adapter
            }

            override fun onFailure(call: Call<ArrayList<PostResponseItem>>, t: Throwable) {

            }

        })

    }

}