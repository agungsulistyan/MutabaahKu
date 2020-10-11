package com.sulistyan.mutabaahku.activity.mutabaah_tilawah.presenter

import com.sulistyan.mutabaahku.activity.mutabaah_tilawah.data.ResultMutabaahTilawah
import com.sulistyan.mutabaahku.model.User
import com.sulistyan.mutabaahku.network.NetworkConfig
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MutabaahTilawahPresenter(val mutabaahTilawahView: MutabaahTilawahView) {
    fun getDataMutabahTilawah(user: User?) {
        NetworkConfig.service()
            .getDataTilawah(user?.id)
            .enqueue(object: Callback<ResultMutabaahTilawah>{
                override fun onFailure(call: Call<ResultMutabaahTilawah>, t: Throwable) {
                    mutabaahTilawahView.onErrorDataMutabaahTilawah(t.localizedMessage)
                }

                override fun onResponse(
                    call: Call<ResultMutabaahTilawah>,
                    response: Response<ResultMutabaahTilawah>
                ) {
                    val body = response.body()
                    if (body?.status == 200) {
                        mutabaahTilawahView.onSuccessDataMutabaahTilawah(body.mutabaahTilawah)
                    } else {
                        mutabaahTilawahView.onErrorDataMutabaahTilawah(body?.message)
                    }
                }
            })
    }
}