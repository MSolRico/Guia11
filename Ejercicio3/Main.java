/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio3;

import Ejercicio3.Servicio.CartaServicio;
import java.util.Scanner;

/**
 *
 * @author SFC
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CartaServicio c1 = new CartaServicio();
        Scanner leer = new Scanner(System.in);
        int choice;
        c1.crearMazo();
        do {
            System.out.println("===============");
            System.out.println("     MENU      ");
            System.out.println("===============");
            System.out.println("1-Mezclar");
            System.out.println("2-Cantidad de cartas disponibles");
            System.out.println("3-Solicitar Cartas");
            System.out.println("4-Cartas Salidas");
            System.out.println("5-Cartas Disponibles");
            System.out.println("6-Salir");

            choice = leer.nextInt();

            switch (choice) {
                case 1:
                    c1.barajar();
                    break;
                case 2:
                    c1.cartasDisponibles();
                    break;
                case 3:
                    c1.darCartas();
                    break;
                case 4:
                    c1.cartasMonton();
                    break;
                case 5:
                    c1.mostrarBaraja();
                    break;
            }
        } while (choice != 6);

        System.out.println("Gracias por jugar con nosotros");

    }

}
