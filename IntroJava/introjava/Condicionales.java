package introjava;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Condicionales {

    public static void main(String[] args) {
        int opinion;
        Scanner leer = new Scanner(System.in);
        System.out.println("Clasifique la peli del 1 al 5 estrellas");
        opinion = leer.nextInt();

        if (opinion >= 1 && opinion <= 5) {
            switch (opinion) {
                case 1:
                case 2:
                    System.out.println("Nos sentimos apenados que no hayas disfrutado la peli");
                    break;
                case 3:
                    System.out.println("Has calificado la peli como buena");
                    break;
                case 4:
                    System.out.println("Has calificado la peli como muy buena");
                    break;
                case 5:
                    System.out.println("Te ha encantado la peli");
                    break;
            }
        } else if (opinion < 0) {
            System.out.println("Opinion negativa? Tan mala fue la pelicula?");
        } else if (opinion == 0) {
            System.out.println("El valor " + opinion + " no es valido y no se tomara en cuenta :(");
        } else {
            System.out.println(opinion + " WOW gracias por tan alta calificacion :D");
        }
        System.out.println("Hasta la proxima!!");
    }
}
    

