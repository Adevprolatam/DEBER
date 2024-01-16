/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.deber;

/**
 *
 * @author fabri                
 */
    class Persona {
        String nombre;
        int edad = -1;
        String email;

        Persona(String nombre, int edad, String email) {
            this.nombre = nombre;
            this.edad = edad;
            this.email = email;
        }

        void mostrarInfo() {
            System.out.println("Persona {Nombre: " + nombre + "; Email: " +
                    (email != null ? email : "email no proporcionado") +
                    "; Edad: " + (edad != -1 ? edad : "No definida") + "}");
        }
    }
    

