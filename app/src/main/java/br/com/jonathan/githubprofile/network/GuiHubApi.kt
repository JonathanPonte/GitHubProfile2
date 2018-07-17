package br.com.jonathan.githubprofile.network

import br.com.jonathan.githubprofile.database.Repository
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface GuiHubApi {

   @GET("users/{user}/repos")
    fun getRepositorios(@Path("user") user : String ): Call<List<Repository>>




}