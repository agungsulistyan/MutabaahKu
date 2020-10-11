package com.sulistyan.mutabaahku.activity.mutabaah_tilawah.presenter

import com.sulistyan.mutabaahku.model.MutabaahTilawah

interface MutabaahTilawahView {
    fun onSuccessDataMutabaahTilawah(data: List<MutabaahTilawah?>?)
    fun onErrorDataMutabaahTilawah(msg: String?)

    fun onSuccessDeleteMutabaahTilawah(msg : String?)
    fun onErrorDeleteMutabaahTilawah(msg : String?)
}