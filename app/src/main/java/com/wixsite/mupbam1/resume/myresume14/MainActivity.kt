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

var Kupishuz1: String = "\n" +
        "Основные обязанности: cвоевременная отгрузка продукции со склада компании. \n" +
        "Ст.Удельная, Московская Область"
var  Vympelcom1: String = "\n" +
        "Основные обязанности: Работа в системе 1-С,\n" +
        "специализированном прикладном ПО. \n" +
        "Обеспечение бесперебойной связи абонентов, услуги связи. \n" +
        "Выполнение плана продаж. Обслуживание клиентов офиса. г.Москва"
var  Demidov1: String = "\n" +
        "Основные обязанности: Оптовая торговля металлопрокатом. \n" +
        "Выполнение плана продаж. Офис в г.Москва"
var  KRSU1: String = "\n" +
        "Открытие оптового склада. Организация оптовой торговли строительными материалами (комплектующие для производства окон). \n" +
        "формирование и ведение клиентской базы. переговоры. ведение банковского счета. логистика. Руководство персоналом. \n" +
        "г.Казань."
var  school1: String = "\n" +
        "1995 -2000 Кыргызско-Российский Славянский Университет    1985-1995 СШ№35\n" +
        "Обучение в университете по специальности: менеджер финансово-банковского менеджмента\n" +
        "и в общеобразовательной школе г.Бишкек, которую окончил с золотой медалью."
var sp = ""

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
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
            setTextFields(KRSU1)  }
        school.setOnClickListener {
            Expression.text = sp
            setTextFields(school1)  }
    }
    fun MapAct() {
        val MapIntent = Intent(this, MainActivity2::class.java)
        startActivity(MapIntent)
    }
    fun setTextFields (str: String){
        Expression.append(str)
    }

}

