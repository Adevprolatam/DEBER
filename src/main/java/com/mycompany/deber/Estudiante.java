/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.deber;

/**     
 *
 * @author fabri
 */
class Estudiante extends Persona {
    int nivel;
    String carrera;

    Estudiante(String nombre, int edad, int nivel, String carrera, String email) {
        super(nombre, edad, email);
        this.nivel = nivel;
        this.carrera = carrera;
    }

    void mostrarInfo() {
        System.out.println("Estudiante {Nombre: " + nombre + "; Email: " +
                (email != null ? email : "email no proporcionado") +
                "; Edad: " + (edad != -1 ? edad : "No definida") +
                "; Nivel: " + nivel +
                "; Carrera: \"" + carrera + "\"}");
    }
}


    

