/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3.Servicio;

import Ejercicio3.entidades.Carta;
import Ejercicio3.enumeracion.Palo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene
 * un número entre 1 y 12 (el 8 y el 9 no los incluimos) y un palo (espadas,
 * bastos, oros y copas). Esta clase debe contener un método toString() que
 * retorne el número de carta y el palo. La baraja estará compuesta por un
 * conjunto de cartas, 40 exactamente. Las operaciones que podrá realizar la
 * baraja son: • barajar(): cambia de posición todas las cartas aleatoriamente.
 * • siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando
 * no haya más o se haya llegado al final, se indica al usuario que no hay más
 * cartas. • cartasDisponibles(): indica el número de cartas que aún se puede
 * repartir. • darCartas(): dado un número de cartas que nos pidan, le
 * devolveremos ese número de cartas. En caso de que haya menos cartas que las
 * pedidas, no devolveremos nada, pero debemos indicárselo al usuario. •
 * cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido
 * ninguna indicárselo al usuario • mostrarBaraja(): muestra todas las cartas
 * hasta el final. Es decir, si se saca una carta y luego se llama al método,
 * este no mostrara esa primera carta.
 */
public class CartaServicio {

    Scanner read = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Carta> Mazo = new ArrayList();
    ArrayList<Carta> salidas = new ArrayList();

    public void crearMazo() {
        for (int i = 1; i < 13; i++) {
            if (i != 8 && i != 9) {
                for (Palo aux : Palo.values()) {
                    Mazo.add(new Carta(i, aux));
                }
            }
        }
    }

    public void barajar() {
        Collections.shuffle(Mazo);
    }

    public Carta siguienteCarta() {
        if (!Mazo.isEmpty()) {
            System.out.println(Mazo.get(0));
            salidas.add(Mazo.get(0));
            Mazo.remove(0);
            return Mazo.get(0);
        } else {
            System.out.println("Ya no quedan más cartas");
            return null;
        }
    }

    public void cartasDisponibles() {
        System.out.println("Cartas disponibles: " + Mazo.size());
    }

    public void darCartas() {
        int num = 0;
        do {
            System.out.println("Cuantas cartas quiere:");
            num = read.nextInt();
            if (Mazo.size() > num) {
                for (int i = 0; i < num; i++) {
                    siguienteCarta();
                }
            } else {
                System.out.println("No tengo cartas suficientes");
            }
        } while (Mazo.size() < num);
    }

    public void cartasMonton() {
        if (!salidas.isEmpty()) {
            for (Carta carta : salidas) {
                System.out.println(carta);
            }
        } else {
            System.out.println("No a salido ninguna todavía");
        }
    }

    public void mostrarBaraja() {
        for (Carta carta : Mazo) {
            System.out.println(carta);
        }
    }
}
