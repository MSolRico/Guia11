package Ejercicio2.Servicio;

import Ejercicio2.Entidades.Juego;
import Ejercicio2.Entidades.Jugador;
import Ejercicio2.Entidades.RevolverDeAgua;
import java.util.ArrayList;

public class JuegoServicio {

    public Juego llenarJuego(ArrayList<Jugador> jugadores, RevolverDeAgua r1) {

        return new Juego(jugadores, r1);
    }

    public void ronda(Juego ju) {

        JugadorServicio jgs = new JugadorServicio();
        boolean r = false;
        int i = 0;
        do {
            for (i = 0; i < ju.getJugadores().size(); i++) {
                r = jgs.disparo(ju.getJugadores().get(i), ju.getRevolver());
                if (r) {
                    System.out.println("Terminó el juego, pierde " + ju.getJugadores().get(i).getNombre());
                    break;
                }
            }
        } while (r==false);
    }
}
