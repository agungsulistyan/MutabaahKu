package com.sulistyan.mutabaahku.activity.login

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.sulistyan.mutabaahku.MainActivity
import com.sulistyan.mutabaahku.R
import com.sulistyan.mutabaahku.activity.register.RegisterActivity
import com.sulistyan.mutabaahku.base.BaseActivity
import com.sulistyan.mutabaahku.model.User
import kotlinx.android.synthetic.main.activity_login.*
import org.jetbrains.anko.sdk25.coroutines.onClick
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.toast

class LoginActivity : AppCompatActivity(), LoginView {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        initActionButton()
    }

    private fun initActionButton() {
        btLogin.onClick {
            val user = User()
            user.username = etLoginUsername.text.toString()
            user.password = etLoginPassword.text.toString()

            LoginPresenter(this@LoginActivity).login(user)
        }
        goRegister.onClick {
            startActivity<RegisterActivity>()
        }
    }

    override fun onSuccessLogin(user: User?) {
        toast("Berhasil login").show()

        startActivity<MainActivity>(BaseActivity.TAGS.USER to user)
    }

    override fun onErrorLogin(msg: String?) {
        toast(msg ?: "").show()
    }

}