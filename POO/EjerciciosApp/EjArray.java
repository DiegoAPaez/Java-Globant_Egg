package EjerciciosApp;


import java.util.Arrays;

public class EjArray {
    public static void main(String[] args) {
        double[] array50 = new double[50];
        double[] array20 = new double[20];

        for (int i = 0; i < 50; i++) {
            array50[i] = (Math.random()*10);
        }

        System.out.println(Arrays.toString(array50));
        Arrays.sort(array50);

        for (int i = 0; i < 20; i++) {
            if (i < 10) {
                array20[i] = array50[i];
            } else {
                array20[i] = (Math.random()*10);
            }
        }

        System.out.println(Arrays.toString(array50));
        System.out.println(Arrays.toString(array20));
    }
}
/*
Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
20.
 */