package br.com.renancorredato.calculanota

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btClacular = calcular
        val txtresultado = resultado

        btClacular.setOnClickListener {
            val nota1 = Integer.parseInt(nota1.text.toString())
            val nota2 = Integer.parseInt(nota2.text.toString())
            val media = (nota1 + nota2)/2
            val faltas = Integer.parseInt(faltas.text.toString())

            if (media >=6 && faltas <=10) {
                txtresultado.setText("Anulo foi Aprovado \n Nota Final: $media\n Faltas: $faltas ")
                txtresultado.setTextColor(Color.GREEN)
            }
            else{
                txtresultado.setText("Anulo foi Reprovado \n Nota Final: $media\n Faltas: $faltas ")
                txtresultado.setTextColor(Color.RED)
            }
        }
    }
}