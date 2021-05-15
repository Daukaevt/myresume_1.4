package com.wixsite.mupbam1.resume.myresume14

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.yandex.mapkit.Animation
import com.yandex.mapkit.MapKitFactory
import com.yandex.mapkit.geometry.Point
import com.yandex.mapkit.map.CameraPosition
import com.yandex.mapkit.mapview.MapView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        adress.setOnClickListener {
            MapAct()
        }
    }
    fun MapAct() {
        val MapIntent = Intent(this, MainActivity2::class.java)
        startActivity(MapIntent)
    }

}

