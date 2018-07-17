package br.com.jonathan.githubprofile.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class BaseRetrofit {


    fun configurarRetrofit() : Retrofit{

        return Retrofit.Builder().baseUrl("https://api.github.com/").addConverterFactory(GsonConverterFactory.create()).build()



    }



}