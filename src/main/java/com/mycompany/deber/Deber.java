/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.deber;

/**
 *
 * @author fabri
 */
public class Deber {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Juan", 16, 1, "Software", null);
        Estudiante estudiante2 = new Estudiante("Martha", 19, 5, "Mecanica", "martha@espe.edu.ec");
        Estudiante estudiante3 = new Estudiante("Carlos", 17, 3, "Electronica", null);
        Estudiante estudiante4 = new Estudiante("Patricia", 20, 8, "Petroquimica", "patty@espe.edu.ec");

        estudiante1.mostrarInfo();
        estudiante2.mostrarInfo();
        estudiante3.mostrarInfo();
        estudiante4.mostrarInfo();
    }
}           
