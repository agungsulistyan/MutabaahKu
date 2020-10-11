package com.sulistyan.mutabaahku.activity.mutabaah_tilawah

import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import com.sulistyan.mutabaahku.R
import com.sulistyan.mutabaahku.activity.mutabaah_tilawah._add.AddMutabaahTilawahActivity
import com.sulistyan.mutabaahku.activity.mutabaah_tilawah.adapter.MutabaahTilawahAdapter
import com.sulistyan.mutabaahku.activity.mutabaah_tilawah.presenter.MutabaahTilawahPresenter
import com.sulistyan.mutabaahku.activity.mutabaah_tilawah.presenter.MutabaahTilawahView
import com.sulistyan.mutabaahku.base.BaseActivity
import com.sulistyan.mutabaahku.model.MutabaahTilawah
import kotlinx.android.synthetic.main.activity_data_kegiatan_tilawah.*
import org.jetbrains.anko.sdk25.coroutines.onClick
import org.jetbrains.anko.startActivity

class MutabaahTilawahActivity : BaseActivity(), MutabaahTilawahView {

    override fun onCreate(savedInstanceState: Bundle?) {
        cekSesi(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_kegiatan_tilawah)

        setActionButton()

        refreshMubataanTilawah()
    }

    private fun setActionButton() {
        btAddDataBarang.onClick {
            startActivity<AddMutabaahTilawahActivity>(TAGS.USER to user)
        }
    }

    private fun refreshMubataanTilawah() {
        MutabaahTilawahPresenter(this).getDataMutabahTilawah(user)
    }

    override fun onSuccessDataMutabaahTilawah(data: List<MutabaahTilawah?>?) {
        rvDataBarang.adapter = MutabaahTilawahAdapter(data, object : MutabaahTilawahAdapter.OnMenuClicked{
            override fun click(menuItem: MenuItem, mutabaahTilawah: MutabaahTilawah?) {
                when(menuItem.itemId) {

                }
            }
        })
    }

    override fun onErrorDataMutabaahTilawah(msg: String?) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
    }

    override fun onSuccessDeleteMutabaahTilawah(msg: String?) {
        TODO("Not yet implemented")
    }

    override fun onErrorDeleteMutabaahTilawah(msg: String?) {
        TODO("Not yet implemented")
    }

}