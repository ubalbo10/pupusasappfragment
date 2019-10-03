package com.example.pruebareciclerview

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class DetalleOrden : AppCompatActivity() {
    private var recyclerView: RecyclerView? = null
    private var adaptador: AdapterListDetalle? = null



    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalle_orden)

        val params=this.intent.extras

        var pupusa = params?.getParcelableArrayList<Pupusa>("pupusa")
        var fragment=fragmen.newInstance(pupusa!!)
        val builder = supportFragmentManager
        .beginTransaction()
        .add(R.id.fragmenId, fragment, FRAGMENT_TAG)
         builder.commit()

    }

    companion object{
        const val FRAGMENT_TAG = "FRAGMENT_TAG"
    }
}
