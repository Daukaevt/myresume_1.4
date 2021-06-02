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

var sp = ""

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val Kupishuz1: String = getString(R.string.kupishuz1)
        val Vympelcom1: String = getString(R.string.vympelcom1)
        val Demidov1: String = getString(R.string.demidov1)
        val KZN: String = getString(R.string.kzn)
        val School1: String = getString(R.string.school1)
        adress.setOnClickListener {
            MapAct()
        }
        Kupishuz.setOnClickListener {
            Expression.text = sp
            Expression.textColors
            setTextFields(Kupishuz1)}
        Vympelcom.setOnClickListener {
            Expression.text = sp
            setTextFields(Vympelcom1)  }
        Demidov.setOnClickListener {
            Expression.text = sp
            setTextFields( Demidov1)}
        Kzn.setOnClickListener {
            Expression.text = sp
            setTextFields(KZN)  }
        school.setOnClickListener {
            Expression.text = sp
            setTextFields(School1)  }
    }
    fun MapAct() {
        val MapIntent = Intent(this, MainActivity2::class.java)
        startActivity(MapIntent)
    }
    fun setTextFields (str: String){
        Expression.append(str)
    }

}

