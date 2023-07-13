package EjerciciosApp;

import java.util.Date;
import java.util.Scanner;

public class EjDate {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar un dia");
        int dia = leer.nextInt();
        System.out.println("Ingresar un mes");
        int mes = leer.nextInt();
        System.out.println("Ingresar un anio");
        int anio = leer.nextInt();
        Date nuevaFecha = new Date(anio ,mes ,dia);
        Date fechaActual = new Date();
        System.out.println(nuevaFecha);
        System.out.println(fechaActual);
    }
}
/*
Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que
se puede conseguir instanciando un objeto Date con constructor vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
*/
