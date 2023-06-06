package extras;

import java.util.Scanner;

public class Extra14 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Indicar la cantidad de familias");
        int nFamilias = leer.nextInt();
        int nHijos;
        int totalHijos = 0;
        int edad;
        double promedioEdades = 0;

        for (int i = 1; i <= nFamilias; i++) {
            System.out.println("Cuantos hijos tiene la familia -> " + i);
            nHijos = leer.nextInt();
            totalHijos = totalHijos + nHijos;
            for (int j = 1; j <= nHijos; j++) {
                System.out.println("Que edad tiene el hijo -> " + j);
                edad = leer.nextInt();
                promedioEdades = promedioEdades + edad;
            }
        }
        promedioEdades = promedioEdades / totalHijos;
        System.out.println("promedioEdades = " + promedioEdades);
    }
}
/*
Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de
hijos. Escriba un programa que pida la cantidad de familias y para cada familia la cantidad
de hijos para averiguar la media de edad de los hijos de todas las familias.
 */