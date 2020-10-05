package com.sulistyan.mutabaahku.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class User(

	@field:SerializedName("password")
    var password: String? = null,

	@field:SerializedName("nama")
	var nama: String? = null,

	@field:SerializedName("id")
	var id: Int? = null,

	@field:SerializedName("username")
	var username: String? = null
) : Serializable
