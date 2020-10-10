package com.sulistyan.mutabaahku.activity.register

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.sulistyan.mutabaahku.R
import com.sulistyan.mutabaahku.activity.register.presenter.RegisterPresenter
import com.sulistyan.mutabaahku.activity.register.presenter.RegisterView
import com.sulistyan.mutabaahku.model.User
import kotlinx.android.synthetic.main.activity_register.*
import org.jetbrains.anko.sdk25.coroutines.onClick
import org.jetbrains.anko.toast

class RegisterActivity : AppCompatActivity(), RegisterView{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        initActionButton()
    }

    private fun initActionButton() {
        btRegister.onClick {
            val username = etRegisterUsername.text.toString()
            val nama = etRegisterNama.text.toString()
            val password = etRegisterPassword.text.toString()

            if (username.isBlank() || nama.isBlank() || password.isBlank()) {
                onErrorRegister("Form wajib diisi")
            } else {
                val user = User()
                user.username = username
                user.nama = nama
                user.password = password

                RegisterPresenter(this@RegisterActivity).register(user)
            }
        }
        goLogin.onClick {
            finish()
        }
    }

    override fun onSuccessRegister() {
        toast("Berhasil registrasi").show()
        finish()
    }

    override fun onErrorRegister(msg: String?) {
        toast(msg ?: "").show()
    }
}