package extras;

import java.util.Scanner;

public class Extra5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su clase de socio (A, B, C)");
        String claseSocio = (leer.nextLine()).toUpperCase();
        System.out.println("Ingrese el costo del tratamiento");
        double valorReal = leer.nextDouble();
        double valorFinal = 0;

        switch (claseSocio) {
            case "A":
                valorFinal = valorReal * 0.5;
                System.out.println("Para la clase A, dicho tratamiento tiene un costo de: $" + valorFinal);
                break;
            case "B":
                valorFinal = valorReal * 0.35;
                System.out.println("Para la clase B, dicho tratamiento tiene un costo de: $" + valorFinal);
                break;
            case "C":
                System.out.println("Para la clase C, dicho tratamiento no recibe descuentos. Costo total: $" + valorReal);
                break;
        }
    }
}
/*
Una obra social tiene tres clases de socios:
    o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
todos los tipos de tratamientos.
    o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para
los mismos tratamientos que los socios del tipo A.
    o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
tratamientos.

Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
real que represente el costo del tratamiento (previo al descuento) y determine el
importe en efectivo a pagar por dicho socio.
 */