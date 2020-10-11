package com.sulistyan.mutabaahku.activity.mutabaah_tilawah.data

import com.google.gson.annotations.SerializedName
import com.sulistyan.mutabaahku.model.MutabaahTilawah

data class ResultMutabaahTilawah (

    @field:SerializedName("bmKegiatanTilawah")
    val mutabaahTilawah: List<MutabaahTilawah?>? = null,

    @field:SerializedName("message")
    val message: String? = null,

    @field:SerializedName("status")
    val status: Int? = null

)