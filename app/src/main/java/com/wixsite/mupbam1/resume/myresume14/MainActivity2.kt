package com.wixsite.mupbam1.resume.myresume14

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.yandex.mapkit.Animation
import com.yandex.mapkit.MapKitFactory
import com.yandex.mapkit.geometry.Point
import com.yandex.mapkit.map.CameraPosition
import com.yandex.mapkit.mapview.MapView
import kotlinx.android.synthetic.main.activity_main2.*


class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var mapview: MapView? = null

        MapKitFactory.setApiKey("f8a26742-888b-457c-9365-6ef6ec258bc7")
        MapKitFactory.initialize(this)
        setContentView(R.layout.activity_main2)
        mapview = findViewById<MapView>(R.id.mapview)
        mapview.getMap().move(
            CameraPosition(Point(55.598735, 37.985926), 11.0f, 0.0f, 0.0f),
            Animation(Animation.Type.SMOOTH, 0F),
            null)
    }
    override fun onStop() {
        var mapview: MapView? = null
        mapview = findViewById<MapView>(R.id.mapview)
        // onStop calls should be passed to MapView and MapKit instances.
        mapview.onStop()
        MapKitFactory.getInstance().onStop()
        super.onStop()
    }

    override fun onStart() {
        var mapview: MapView? = null
        mapview = findViewById<MapView>(R.id.mapview)
        // onStart calls should be passed to MapView and MapKit instances.
        super.onStart()
        MapKitFactory.getInstance().onStart()
        mapview.onStart()
    }

}
