package extras;

import java.util.Scanner;

public class Extra4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar un numero del 1 al 10");
        int num = leer.nextInt();
        switch (num) {
            case 1:
                System.out.println("El equivalente romano para " + num + " es I");
                break;
            case 2:
                System.out.println("El equivalente romano para " + num + " es II");
                break;
            case 3:
                System.out.println("El equivalente romano para " + num + " es III");
                break;
            case 4:
                System.out.println("El equivalente romano para " + num + " es IV");
                break;
            case 5:
                System.out.println("El equivalente romano para " + num + " es V");
                break;
            case 6:
                System.out.println("El equivalente romano para " + num + " es VI");
                break;
            case 7:
                System.out.println("El equivalente romano para " + num + " es VII");
                break;
            case 8:
                System.out.println("El equivalente romano para " + num + " es VIII");
                break;
            case 9:
                System.out.println("El equivalente romano para " + num + " es IX");
                break;
            case 10:
                System.out.println("El equivalente romano para " + num + " es X");
                break;
            default:
                System.out.println("El numero ingresado no es valido");
        }
    }
}
/*
Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
equivalente en romano.
 */