package extras;

import java.util.Scanner;

public class Extra15 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numeros");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();

        System.out.println("Que operacion desea realizar?");
        System.out.println("1.Sumar");
        System.out.println("2.Restar");
        System.out.println("3.Multiplicar");
        System.out.println("4.Dividir");
        int opcion = leer.nextInt();

        switch (opcion) {
            case 1 :
                System.out.println(sumar(num1, num2));
                break;
            case 2 :
                System.out.println(restar(num1, num2));
                break;
            case 3 :
                System.out.println(multiplicar(num1, num2));
                break;
            case 4 :
                System.out.println(dividir(num1, num2));
                break;
        }
    }
    public static int sumar(int n1, int n2) {
        return n1 + n2;
    }
    public static int restar(int n1, int n2) {
        return n1 - n2;
    }
    public static int multiplicar(int n1, int n2) {
        return n1 * n2;
    }
    public static double dividir(int n1, int n2) {
        return n1 / n2;
    }
}
/*
Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar,
restar, multiplicar y dividir. La aplicación debe tener una función para cada operación
matemática y deben devolver sus resultados para imprimirlos en el main.
 */