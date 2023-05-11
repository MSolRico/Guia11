package Ejercicio2.Servicio;

import Ejercicio2.Entidades.Jugador;
import Ejercicio2.Entidades.RevolverDeAgua;
import java.util.ArrayList;
import java.util.Scanner;

public class JugadorServicio {

    public ArrayList<Jugador> crearJugadores() {
        Scanner imput = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Jugador> jugadores = new ArrayList();

        System.out.println("Ingrese el número de jugadores:");
        int num = imput.nextInt();

        for (int i = 1; i < num + 1; i++) {
            jugadores.add(new Jugador(i, "Jugador " + i, false));
        }
        return jugadores;
    }

    public boolean disparo(Jugador j1, RevolverDeAgua r1) {

        RevolverServicio rs = new RevolverServicio();

        if (rs.mojar(r1)) {
            j1.setMojado(true);
        }

        rs.siguienteChorro(r1);

        return j1.isMojado();
    }
}
