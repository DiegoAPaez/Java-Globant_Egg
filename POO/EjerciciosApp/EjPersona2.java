package EjerciciosApp;

import Servicios.ServicioPersona2;

public class EjPersona2 {
    public static void main(String[] args) {
        ServicioPersona2 persona1 = new ServicioPersona2();
        persona1.crearPersona();
        persona1.calcularEdad();
        persona1.menorQue(18);
        persona1.mostrarPersona();
    }
}
