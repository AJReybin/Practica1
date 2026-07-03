package com.univalle.practica1

class Persona(
    val nombre: String,
    val edad: Int
) {
    override fun toString(): String {
        return "Persona(nombre=$nombre, edad=$edad)"
    }
}