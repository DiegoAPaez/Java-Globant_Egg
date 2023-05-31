package ejercicios;

public class Ejercicio19 {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        int[][] transpuesta = new int[3][3];
        boolean antisimetrica = false;

        // Matriz de Ejemplo
        matriz[0][0] = 0;
        matriz[0][1] = -2;
        matriz[0][2] = 4;
        matriz[1][0] = 2;
        matriz[1][1] = 0;
        matriz[1][2] = 2;
        matriz[2][0] = -4;
        matriz[2][1] = -2;
        matriz[2][2] = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                transpuesta[i][j] = matriz[j][i];
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] == -transpuesta[i][j]) {
                    antisimetrica = true;
                } else {
                    antisimetrica = false;
                    break;
                }
            }
        }

        System.out.println("Antisimetrica = " + antisimetrica);
    }
}
/*
Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una
matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de
signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
 */