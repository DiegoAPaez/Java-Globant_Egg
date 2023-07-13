package EjerciciosApp;

import Entidades.Rectangulo;

public class EjRectangulo {
    public static void main(String[] args) {
        Rectangulo r1 = new Rectangulo();
        r1.crearReactangulo();
        System.out.println("La superficie del rectangulo es de = " + r1.superficie());
        System.out.println("El perimetro del rectangulo es de = " + r1.perimetro());
        r1.dibujar();
    }
}
