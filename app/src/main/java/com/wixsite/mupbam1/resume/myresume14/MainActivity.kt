package com.wixsite.mupbam1.resume.myresume14

import android.R.attr.label
import android.content.ClipData
import android.content.ClipboardManager
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    var clipboardManager: ClipboardManager? = null
    var clipData: ClipData? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
        adress.setOnClickListener {
            MapAct()
        }
    }

    fun init(){
        val Kupishuz1: String = getString(R.string.kupishuz1)
        val Vympelcom1: String = getString(R.string.vympelcom1)
        val Demidov1: String = getString(R.string.demidov1)
        val KZN: String = getString(R.string.kzn)
        val School1: String = getString(R.string.school1)
        val copyEmail: String = getString(R.string.copyEmail)
        var dial: String? = null

        Kupishuz.setOnClickListener {
            setTextFields(Kupishuz1)}
        Vympelcom.setOnClickListener {
            setTextFields(Vympelcom1)  }
        Demidov.setOnClickListener {
            setTextFields( Demidov1)}
        Kzn.setOnClickListener {
            setTextFields(KZN)  }
        school.setOnClickListener {
            setTextFields(School1)  }
        phone.setOnClickListener {
            dial = phone.text.toString()
            startActivity(Intent(Intent.ACTION_DIAL, Uri.parse(dial))) }
        email.setOnClickListener{
            var text: String = email.text.toString()
            val clipboard = getSystemService(CLIPBOARD_SERVICE) as ClipboardManager
            val clip = ClipData.newPlainText(label.toString(), text)
            clipboard.setPrimaryClip(clip)

            Toast.makeText(applicationContext, "$copyEmail", Toast.LENGTH_LONG).show()
        }

    }

    fun MapAct() {
        val MapIntent = Intent(this, MainActivity2::class.java)
        startActivity(MapIntent)
    }

    fun setTextFields (str: String){
        val sp: String = getString(R.string.sp)
        Expression.text = sp
        Expression.append(str)
    }
}

