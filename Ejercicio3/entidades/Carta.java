/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3.entidades;

import Ejercicio3.enumeracion.Palo;

/**
 *
 * @author SFC
 */
public class Carta {
    private int carta;
    private Palo palo;

    public Carta() {
    }

    public Carta(int carta, Palo palo) {
        this.carta = carta;
        this.palo = palo;
    }

    public int getCarta() {
        return carta;
    }

    public void setCarta(int carta) {
        this.carta = carta;
    }

    public Palo getPalo() {
        return palo;
    }

    public void setPalo(Palo palo) {
        this.palo = palo;
    }

    @Override
    public String toString() {
        return "Carta: " + carta + " de " + palo;
    }

}