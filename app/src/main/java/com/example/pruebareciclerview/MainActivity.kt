package com.example.pruebareciclerview

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
  var pupusa:ArrayList<Pupusa>?=null
    private var recyclerView: RecyclerView? = null
    private var adaptador: AdapterList? = null
    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        recyclerView=findViewById(R.id.recyclerId)
        pupusa= ArrayList<Pupusa>()
        pupusa!!.add(Pupusa("Revuelta",0,0))
        pupusa!!.add(Pupusa("Quezo",0,0))
        pupusa!!.add(Pupusa("Frijol con Quezo",0,0))
        pupusa!!.add(Pupusa("chicharon con quezo",0,0))
        pupusa!!.add(Pupusa("quezo con ajo",0,0))
        adaptador=AdapterList(pupusa!!)
        recyclerView!!.adapter=adaptador
        recyclerView!!.layoutManager = LinearLayoutManager(applicationContext, LinearLayoutManager.VERTICAL, false)


    }
}
