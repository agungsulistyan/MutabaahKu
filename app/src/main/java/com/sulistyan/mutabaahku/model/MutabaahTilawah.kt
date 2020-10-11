package com.sulistyan.mutabaahku.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class MutabaahTilawah(
    @field:SerializedName("ayat")
    var ayat: Int? = null,

    @field:SerializedName("surat")
    var surat: Int? = null,

    @field:SerializedName("idBmKegiatanTilawah")
    var idBmKegiatanTilawah: Int? = null,

    @field:SerializedName("tanggal")
    var tanggal: String? = null,

    @field:SerializedName("idUser")
    var idUser: Int? = null

) : Serializable

