package EjerciciosApp;

import Entidades.Operacion;

public class EjOperacion {
    public static void main(String[] args) {
        Operacion op = new Operacion();
        op.crearOperacion();
        op.sumar();
        op.restar();
        System.out.println("El resultado del producto de los numeros es = " + op.multiplicar());
        System.out.println("El resultado de la division de los numeros es = " + op.dividir());
    }
}
