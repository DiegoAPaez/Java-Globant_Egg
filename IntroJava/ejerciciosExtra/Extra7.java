package extras;

import java.util.Scanner;

public class Extra7 {
    public static void main(String[] args) {
        System.out.println("Cuantos numeros desea ingresar?");
        Scanner leer = new Scanner(System.in);
        int numeros = leer.nextInt();
        usoWhile(numeros);
        //usoDoWhile(numeros);
    }

    public static void usoWhile(int n) {
        Scanner leer = new Scanner(System.in);
        int contador = n;
        int valorMax = 0;
        int valorMin = 0;
        double promedio = 0;

        while (contador > 0) {
            System.out.println("Ingrese un numero");
            int num = leer.nextInt();
            promedio = promedio + num;

            if ( num > valorMax ) {
                valorMax = num;
                if (valorMin == 0) {
                    valorMin = num;
                }
            } else if (num < valorMin) {
                valorMin = num;
            }
            contador--;
        }
        promedio = promedio / n;

        System.out.println("El valor maximo ingresado es -> " + valorMax);
        System.out.println("El valor minimo ingresado es -> " + valorMin);
        System.out.println("El promedio de los numeros ingresados es -> " + promedio);
    }

    public static void usoDoWhile(int n) {
        Scanner leer = new Scanner(System.in);
        int contador = n;
        int valorMax = 0;
        int valorMin = 0;
        double promedio = 0;

        do {
            System.out.println("Ingrese un numero");
            int num = leer.nextInt();
            promedio = promedio + num;

            if ( num > valorMax ) {
                valorMax = num;
                if (valorMin == 0) {
                    valorMin = num;
                }
            } else if (num < valorMin) {
                valorMin = num;
            }
            contador--;
        } while (contador > 0) ;

        promedio = promedio / n;
        System.out.println("El valor maximo ingresado es -> " + valorMax);
        System.out.println("El valor minimo ingresado es -> " + valorMin);
        System.out.println("El promedio de los numeros ingresados es -> " + promedio);
    }
}
/*
Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio
de n números (n>0). El valor de n se solicitará al principio del programa y los números
serán introducidos por el usuario. Realice dos versiones del programa, una usando el
bucle “while” y otra con el bucle “do - while”.
 */