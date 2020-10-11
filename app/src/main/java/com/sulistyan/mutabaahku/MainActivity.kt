package com.sulistyan.mutabaahku

import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import com.sulistyan.mutabaahku.activity.login.LoginActivity
import com.sulistyan.mutabaahku.activity.main.adapter.MenuAdapter
import org.jetbrains.anko.startActivity
import com.sulistyan.mutabaahku.activity.main.presenter.MainView
import com.sulistyan.mutabaahku.activity.mutabaah_tilawah.MutabaahTilawahActivity
import com.sulistyan.mutabaahku.base.BaseActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity(), MainView {

    private val TAG = MainActivity::class.java.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        cekSesi(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initActionButton()

        tvWelcome.text = "Welcome\n${user?.username}"
    }

    private fun initActionButton() {
        mainMenu.adapter = MenuAdapter(object : MenuAdapter.OnMenuClick {
            override fun onClick(image: Int) {

                when(image) {
                    R.drawable.ic_mutabaah -> openDataMutabaahTilawah()
                    R.drawable.ic_goods -> openDataBarang()
                    R.drawable.ic_shopping_cart -> openDataPenjualan()
                    R.drawable.ic_report -> openDataLaporan()
                }
            }
        })
    }

    private fun openDataBarang() {}
    private fun openDataPenjualan() {}
    private fun openDataLaporan() {}

    private fun openDataMutabaahTilawah() {
        Log.d(TAG, "Data Mutabaah Tilawah")
        startActivity<MutabaahTilawahActivity>(TAGS.USER to user)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)

        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        finish()
        startActivity<LoginActivity>()
        return super.onOptionsItemSelected(item)
    }

}