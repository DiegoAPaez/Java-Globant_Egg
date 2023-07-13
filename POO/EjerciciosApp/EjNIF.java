package EjerciciosApp;

import Servicios.ServicioNIF;

public class EjNIF {
    public static void main(String[] args) {
        ServicioNIF newNif = new ServicioNIF();
        newNif.crearNif();
        newNif.mostrar();
    }
}
