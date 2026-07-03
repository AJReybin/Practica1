package com.univalle.practica1

import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nombre = findViewById<EditText>(R.id.etNombre)
        val edad = findViewById<EditText>(R.id.etEdad)
        val correo = findViewById<EditText>(R.id.etCorreo)
        val boton = findViewById<Button>(R.id.btnEnviar)

        boton.setOnClickListener {

            val persona = Persona(
                nombre.text.toString(),
                edad.text.toString().toInt()
            )

            val usuario = Usuario(
                nombre.text.toString(),
                correo.text.toString()
            )

            val intent = Intent(this, DetalleActivity::class.java)

            // Enviar datos (como String para simplificar)
            intent.putExtra("persona", persona.toString())
            intent.putExtra("usuario", usuario.toString())
            intent.putExtra("nombre", usuario.nombre)
            intent.putExtra("email", usuario.email)
            intent.putExtra("edad", persona.edad)

            startActivity(intent)
        }
    }
}