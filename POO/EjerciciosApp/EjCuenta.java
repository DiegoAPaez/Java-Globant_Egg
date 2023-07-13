package EjerciciosApp;

import Entidades.Cuenta;

public class EjCuenta {
    public static void main(String[] args) {
        Cuenta c1 = new Cuenta(43568790, 20300400, 20000);
        c1.ingresar(30000);
        c1.retirar(40000);
        c1.extraccionRapida();
        c1.consultarSaldo();
        c1.consultarDatos();
    }
}
