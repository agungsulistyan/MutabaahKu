package com.sulistyan.mutabaahku.network

import com.sulistyan.mutabaahku.activity.login.data.ResultLogin
import com.sulistyan.mutabaahku.activity.mutabaah_tilawah.data.ResultMutabaahTilawah
import com.sulistyan.mutabaahku.response.ResultSimple
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface MutabaahKuService {

    @FormUrlEncoded
    @POST("getDataTilawah")
    fun getDataTilawah (@Field("user_id") user_id : Int?) : Call<ResultMutabaahTilawah>

    @FormUrlEncoded
    @POST("addDataTilawah")
    fun addDataTilawah(@Field("user_id") user_id: Int?,
                  @Field("tanggal") tanggal: String?,
                  @Field("surat") surat: String?,
                  @Field("ayat") ayat: String?) : Call<ResultSimple>

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