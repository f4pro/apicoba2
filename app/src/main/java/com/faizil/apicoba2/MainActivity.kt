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
    lateinit var myAdapter: MyAdapter
    lateinit var linearLayoutManager: LinearLayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        data_rv.setHasFixedSize(true)
        linearLayoutManager = LinearLayoutManager(this)
        data_rv.layoutManager = linearLayoutManager

        getMyData()
    }
    private fun getMyData() {
        val retrofitBuilder = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BASE_URL)
            .build()
            .create(ApiInterface::class.java)

        val retrofitData = retrofitBuilder.getData()

        retrofitData.enqueue(object : Callback<List<ListDataItem>?> {
            override fun onResponse(
                call: Call<List<ListDataItem>?>,
                response: Response<List<ListDataItem>?>
            ) {
                val responseBody = response.body()!!

                myAdapter = MyAdapter(baseContext, responseBody)
                myAdapter.notifyDataSetChanged()
                data_rv.adapter = myAdapter

            }

            override fun onFailure(call: Call<List<ListDataItem>?>, t: Throwable) {
                d("MainActivity", "onFailure: " + t.message)
            }
        })
    }
}