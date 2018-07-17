package br.com.jonathan.githubprofile.business

import br.com.jonathan.githubprofile.database.Repository
import br.com.jonathan.githubprofile.network.GuiHubApi
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit


class Business{


    fun executarRequisicao(usuario : String, retrofit : Retrofit){

        val gitHubService = retrofit.create(GuiHubApi::class.java)





        gitHubService.getRepositorios(usuario).enqueue(object : Callback<List<Repository>>{


            override fun onResponse(call: Call<List<Repository>>?, response: Response<List<Repository>>?) {

                response?.let {

                    if(it.isSuccessful){

                    }




                }



            }



            override fun onFailure(call: Call<List<Repository>>?, t: Throwable?) {

            }


        })








    }

}