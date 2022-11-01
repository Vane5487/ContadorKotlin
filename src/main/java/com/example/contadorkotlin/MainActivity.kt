package com.example.contadorkotlin

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var contador = 0

    val tv_pulsado: TextView? = null
    val btnLimpiar: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var tv_pulsado = findViewById<TextView>(R.id.tv_pulsado)
        var btnLimpiar = findViewById<Button>(R.id.btn_limpiar)

        val btnPulsar = findViewById<Button>(R.id.button)
        val textView = findViewById<TextView>(R.id.textView)

        tv_pulsado.setVisibility(View.INVISIBLE)

        btnPulsar.setOnClickListener {
            contador++
            if (contador == 1) {
                textView.text = "Has pulsado 1 vez"
            } else if (contador > 1) {
                textView.text = "Has pulsado $contador veces"
            }
            tv_pulsado.setVisibility(View.VISIBLE)
            btnLimpiar.setVisibility(View.VISIBLE)
        }

        btnLimpiar.setOnClickListener(View.OnClickListener {
            contador = 0
            textView.text = "Contador a 0"
            tv_pulsado.setVisibility(View.INVISIBLE)
            btnLimpiar.setVisibility(View.INVISIBLE)
        })
    }
}