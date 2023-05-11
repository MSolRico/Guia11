/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio1;

import Ejercicio1.Entidades.Perro;
import Ejercicio1.Entidades.Persona;

/**
 *
 * @author SFC
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Perro p1 = new Perro ("Bonita", "pichicho", "chico", 10);
        Perro p2 = new Perro("Terry", "Pichicho", "mediano", 5);
        Persona s1 = new Persona("Sol", "Rico", 24, 41359877, p1);
        Persona s2 = new Persona("Nicolas", "Gomez", 28, 38176672, p2);
        
        System.out.println(s1);
        System.out.println(s2);
    }
    
}
