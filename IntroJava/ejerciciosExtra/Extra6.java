package extras;

import java.util.Scanner;

public class Extra6 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de personas a evaluar");
        int nPersonas = leer.nextInt();
        int contador = nPersonas;
        double altura;
        double promedioGral = 0.0;
        double promedioBajitos = 0.0;
        int bajitos = 0;

        do {
            System.out.println("Ingrese la altura");
            altura = leer.nextDouble();
            if (altura < 1.6) {
                promedioGral = promedioGral + altura;
                bajitos++;
            } else {
                promedioGral = promedioGral + altura;
            }
            contador--;
        } while (contador > 0);

        if (bajitos > 0) {
            promedioBajitos = 100 / (nPersonas * bajitos);
        }
        System.out.println("El promedio de estaturas por debajo de 1.60mts es de -> " + promedioBajitos + "%");
        promedioGral = promedioGral / nPersonas;
        System.out.println("El promedio de estatura en general es de -> " + promedioGral);
    }
}
/*
Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por
debajo de 1.60 mts. y el promedio de estaturas en general.
 */