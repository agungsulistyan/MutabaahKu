package com.sulistyan.mutabaahku.activity.login

import com.sulistyan.mutabaahku.model.User

interface LoginView {
    fun onSuccessLogin(user: User?)
    fun onErrorLogin(msg: String?)
}