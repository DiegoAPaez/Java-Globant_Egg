package EjerciciosApp;

import Entidades.Circunferencia;

public class EjCircunferencia {
    public static void main(String[] args) {
        // Constructor por Parametro
        Circunferencia c1 = new Circunferencia(5);

        // Solicita radio al usuario
        c1.crearCircunferencia();

        // Calculos
        c1.area();
        c1.perimetro();
    }
}
