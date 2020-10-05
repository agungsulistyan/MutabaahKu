package com.sulistyan.mutabaahku.activity.login.data

import com.google.gson.annotations.SerializedName
import com.sulistyan.mutabaahku.model.User

data class ResultLogin(

	@field:SerializedName("message")
	val message: String? = null,

	@field:SerializedName("user")
	val user: User? = null,

	@field:SerializedName("status")
	val status: Int? = null
)
