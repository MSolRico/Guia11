package Ejercicio2.Entidades;

import java.util.ArrayList;

public class Juego {

    private RevolverDeAgua revolver;
    private ArrayList<Jugador> jugadores;

    public Juego() {
    }

    public Juego(ArrayList<Jugador> jugadores, RevolverDeAgua revolver) {
        this.revolver = revolver;
        this.jugadores = jugadores;
    }

    public RevolverDeAgua getRevolver() {
        return revolver;
    }

    public void setRevolver(RevolverDeAgua revolver) {
        this.revolver = revolver;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    @Override
    public String toString() {
        return "Juego{" + "revolver=" + revolver + ", jugadores=" + jugadores + '}';
    }

}
