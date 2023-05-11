package Ejercicio2.Servicio;

import Ejercicio2.Entidades.RevolverDeAgua;

public class RevolverServicio {

    public RevolverDeAgua llenarRevolver() {

        int posicionActual = (int) (Math.random() * (6 - 1) + 1);
        int posicionAgua = (int) (Math.random() * (6 - 1) + 1);

        return new RevolverDeAgua(posicionActual, posicionAgua);
    }

    public boolean mojar(RevolverDeAgua r1) {

        return r1.getPosicionActual() == r1.getPosicionAgua();
    }

    public void siguienteChorro(RevolverDeAgua r1) {
        
        mostrarRevolver(r1);
        
        if (r1.getPosicionActual() < 6) {
            r1.setPosicionActual(r1.getPosicionActual() + 1);
        } else {
            r1.setPosicionActual(1);
        }

    }

    public void mostrarRevolver(RevolverDeAgua r1) {
        
        System.out.println(r1.toString());
    }
}
