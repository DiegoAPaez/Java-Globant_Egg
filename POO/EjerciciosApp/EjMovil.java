package EjerciciosApp;

import Servicios.ServicioMovil;

public class EjMovil {
    public static void main(String[] args) {
        ServicioMovil nuevoMovil = new ServicioMovil();
        nuevoMovil.cargarCelular();
        System.out.println(nuevoMovil.toString());
    }
}
