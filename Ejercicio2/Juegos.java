package Ejercicio2;

import Ejercicio2.Entidades.Juego;
import Ejercicio2.Entidades.Jugador;
import Ejercicio2.Entidades.RevolverDeAgua;
import Ejercicio2.Servicio.JuegoServicio;
import Ejercicio2.Servicio.JugadorServicio;
import Ejercicio2.Servicio.RevolverServicio;
import java.util.ArrayList;

public class Juegos {

    public static void main(String[] args) {
        JuegoServicio js = new JuegoServicio();
        JugadorServicio jgs = new JugadorServicio();
        RevolverServicio rs = new RevolverServicio();
        RevolverDeAgua r1 = rs.llenarRevolver();
        ArrayList<Jugador> jugadores = jgs.crearJugadores();
        Juego ju = js.llenarJuego(jugadores, r1);
        js.ronda(ju);
    }

}
