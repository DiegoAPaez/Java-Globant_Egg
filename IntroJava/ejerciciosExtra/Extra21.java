package extras;

import java.util.Scanner;

public class Extra21 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double promedio = 0;
        int aprobados = 0;
        int desaprobados = 0;
        System.out.println("Indique la cantidad de alumnos");
        int n = leer.nextInt();
        double[][] notasAlumnos = new double[n][5];

        for (int i = 0; i < n; i++) {
            notasAlumnos[i][0] = i;
            for (int j = 1; j < 5; j++) {
                switch (j) {
                    case 1:
                        System.out.println("Nota del Primer trabajo práctico evaluativo, alumno " + i);
                        notasAlumnos[i][j] = leer.nextInt();
                        break;
                    case 2:
                        System.out.println("Nota del Segundo trabajo práctico evaluativo, alumno " + i);
                        notasAlumnos[i][j] = leer.nextInt();
                        break;
                    case 3:
                        System.out.println("Nota del Primer Integrador, alumno " + i);
                        notasAlumnos[i][j] = leer.nextInt();
                        break;
                    case 4:
                        System.out.println("Nota del Segundo Integrador, alumno " + i);
                        notasAlumnos[i][j] = leer.nextInt();
                        break;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < 5; j++) {
                switch (j) {
                    case 1:
                        promedio = promedio + (notasAlumnos[i][j] * 0.1);
                        break;
                    case 2:
                        promedio = promedio + (notasAlumnos[i][j] * 0.15);
                        break;
                    case 3:
                        promedio = promedio + (notasAlumnos[i][j] * 0.25);
                        break;
                    case 4:
                        promedio = promedio + (notasAlumnos[i][j] * 0.5);
                        break;
                }
            }
            if (promedio >= 7) {
                aprobados++;
            } else {
                desaprobados++;
            }
            promedio = 0;
        }

        System.out.println("Alumnos aprobados = " + aprobados);
        System.out.println("Alumnos desaprobados = " + desaprobados);
    }
}
/*
Los profesores del curso de programación de Egg necesitan llevar un registro de las notas
adquiridas por sus 10 alumnos para luego obtener una cantidad de aprobados y
desaprobados. Durante el periodo de cursado cada alumno obtiene 4 notas, 2 por trabajos
prácticos evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
    Primer trabajo práctico evaluativo 10%
    Segundo trabajo práctico evaluativo 15%
    Primer Integrador 25%
    Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final del
programa los profesores necesitan obtener por pantalla la cantidad de aprobados y
desaprobados, teniendo en cuenta que solo aprueban los alumnos con promedio mayor o
igual al 7 de sus notas del curso.
*/
