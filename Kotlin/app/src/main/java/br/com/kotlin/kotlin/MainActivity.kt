package br.com.kotlin.kotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton

class MainActivity : AppCompatActivity() {

    lateinit var valorTemp: EditText
    lateinit var celciusRadio: RadioButton
    lateinit var fahreinheitRadio: RadioButton
    lateinit var converterButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        valorTemp = findViewById(R.id.valorTemp) as EditText
        celciusRadio = findViewById(R.id.celciusRadio) as RadioButton
        fahreinheitRadio = findViewById(R.id.fahreinheitRadio) as RadioButton
        converterButton = findViewById(R.id.converterButton) as Button

        converterButton.setOnClickListener { converter() }
    }

    fun converter() {
        var temp: Double = valorTemp.text.toString().toDouble()

        if (celciusRadio.isChecked)
            temp = (temp - 32) * 5 / 9
        else if (fahreinheitRadio.isChecked)
            temp = temp * 9 / 5 + 32

        valorTemp.setText(temp.toString())
    }

}