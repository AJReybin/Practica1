package com.univalle.practica1

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
class DetalleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalle)

        val resultado = findViewById<TextView>(R.id.tvResultado)

        val nombre = intent.getStringExtra("nombre") ?: ""
        val email = intent.getStringExtra("email") ?: ""
        val edad = intent.getIntExtra("edad", 0)

        // Crear objetos nuevamente
        val persona1 = Persona(nombre, edad)
        val persona2 = Persona(nombre, edad)

        val usuario1 = Usuario(nombre, email)
        val usuario2 = Usuario(nombre, email)

        val texto = """
            === PERSONA ===
            Nombre: ${persona1.nombre}
            Edad: ${persona1.edad}
            
            === USUARIO ===
            Nombre: ${usuario1.nombre}
            Email: ${usuario1.email}
            
            === toString() ===
            Persona: ${persona1.toString()}
            Usuario: ${usuario1.toString()}
            
            === COMPARACIONES ===
            Usuario1 == Usuario2 → ${usuario1 == usuario2}
            Persona1 == Persona2 → ${persona1 == persona2}
        """.trimIndent()

        resultado.text = texto
    }
}