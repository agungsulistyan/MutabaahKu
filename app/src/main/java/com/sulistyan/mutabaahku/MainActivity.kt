package com.sulistyan.mutabaahku

import android.os.Bundle
import com.sulistyan.mutabaahku.base.BaseActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        cekSesi(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvWelcome.text = "Welcome\n${user?.username}"
    }

}