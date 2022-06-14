package com.tom.calculator

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun calculate(view: View) {
        var premier_nombre = if (nombre_1.text.toString().isEmpty()) 0 else nombre_1.text.toString().toInt()
        var second_nombre = if (nombre_2.text.toString().isEmpty()) 0 else nombre_2.text.toString().toInt()
        if (premier_nombre == 0 || second_nombre == 0) {
            resultat.text = "Erreur, un des nombres est 0 ou vide"
            return
        }
        when (view.id) {
            R.id.bouton_plus -> resultat.text = (premier_nombre + second_nombre).toString()
            R.id.bouton_moins -> resultat.text = (premier_nombre - second_nombre).toString()
            R.id.bouton_fois -> resultat.text = (premier_nombre * second_nombre).toString()
            R.id.bouton_divi -> resultat.text = (premier_nombre / second_nombre).toString()
        }
    }
}
