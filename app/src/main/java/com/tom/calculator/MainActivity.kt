package com.tom.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun calculate(view: View) {
        var premier_nombre = nombre_1.text.toString().toInt()
        var second_nombre = nombre_2.text.toString().toInt()
        var operation = ""
        var calcul = 0
        when (view.id) {
            R.id.bouton_plus -> operation = "+"
            R.id.bouton_moins -> operation = "-"
            R.id.bouton_fois -> operation = "*"
            R.id.bouton_divi -> operation = "/"
        }
        if (operation == "+") {
            calcul = premier_nombre + second_nombre
        } else if (operation == "-") {
            calcul = premier_nombre - second_nombre
        } else if (operation == "*") {
            calcul = premier_nombre * second_nombre
        } else if (operation == "/") {
            calcul = premier_nombre / second_nombre
        }
        resultat.text = calcul.toString()
    }
}

