package extras;

import java.util.Scanner;

public class Extra13 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la altura de la escalera");
        int escalera = leer.nextInt();
        String escalones = "";

        for (int i = 1; i <= escalera; i++) {
            escalones = escalones.concat(String.valueOf(i));
            System.out.println(escalones);
        }
    }
}
/*
Crear un programa que dibuje una escalera de números, donde cada línea de números
comience en uno y termine en el número de la línea. Solicitar la altura de la escalera al
usuario al comenzar. Ejemplo: si se ingresa el número 3:
1
12
123
 */