package com.sulistyan.mutabaahku.network

import com.sulistyan.mutabaahku.activity.login.data.ResultLogin
import com.sulistyan.mutabaahku.response.ResultSimple
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface MutabaahKuService {

    @FormUrlEncoded
    @POST("registerUser")
    fun registerUser (@Field("username") username : String?,
                      @Field("nama") nama : String?,
                      @Field("password") password : String?) : Call<ResultSimple>

    @FormUrlEncoded
    @POST("login")
    fun loginUser (@Field("username") username : String?,
                   @Field("password") password : String?) : Call<ResultLogin>
}