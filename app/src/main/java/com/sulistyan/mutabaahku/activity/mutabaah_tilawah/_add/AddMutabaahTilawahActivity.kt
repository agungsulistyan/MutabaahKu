package com.sulistyan.mutabaahku.activity.mutabaah_tilawah._add

import android.os.Bundle
import com.sulistyan.mutabaahku.R
import com.sulistyan.mutabaahku.activity.mutabaah_tilawah._add.presenter.AddMutabaahTilawahView
import com.sulistyan.mutabaahku.base.BaseActivity
import org.jetbrains.anko.toast

class AddMutabaahTilawahActivity : BaseActivity(), AddMutabaahTilawahView {

    override fun onCreate(savedInstanceState: Bundle?) {
        cekSesi(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_kegiatan_tilawah)

        val intent = null

        if (intent != null) {
            //setActionEditButton(intent)
        } else {
            //setActionTambahButton()
        }
    }

    override fun onSuccessAddMutabaahTilawah(msg: String?) {
        toast(msg ?: "").show()
        finish()
    }

    override fun onErrorAddMutabaahTilawah(msg: String?) {
        toast(msg ?: "").show()
    }

}