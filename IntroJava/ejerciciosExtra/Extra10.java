package extras;


import java.util.Scanner;

public class Extra10 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numeroAleatorio1 = (int) (Math.random()*10+1);
        int numeroAleatorio2 = (int) (Math.random()*10+1);
        int adivinar = numeroAleatorio1 * numeroAleatorio2;
        int numUser;

        do {
            System.out.println("Adivine el resultado de la multiplicacion");
            numUser = leer.nextInt();

            if (numUser == adivinar) {
                System.out.println("Correcto! has adivinado el resultado");
            } else {
                System.out.println("Sigue intentandolo");
            }
        } while (numUser != adivinar);
    }
}
/*
Realice un programa para que el usuario adivine el resultado de una multiplicación entre
dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como
utilizar la función Math.random() de Java.
 */