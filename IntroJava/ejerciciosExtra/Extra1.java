package extras;

import java.util.Scanner;

import static java.lang.Math.floor;

public class Extra1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una cantidad de minutos");
        int minutos = leer.nextInt();
        int dias;
        int horas;

        dias = (int) floor(minutos / 1440);
        horas = (int) floor(minutos - 1440)/60;
        System.out.println("dias = " + dias);
        System.out.println("horas = " + horas);
    }
}
/*
Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
 */