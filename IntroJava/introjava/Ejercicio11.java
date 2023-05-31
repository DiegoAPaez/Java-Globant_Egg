package introjava;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase = leer.nextLine();

        System.out.println(codificador(frase));
    }
    public static String codificador(String texto) {
        String codificado = "";
        for (int i = 0; i < texto.length(); i++) {
            codificado = switch (texto.substring(i, i + 1).toLowerCase()) {
                case "a" -> codificado.concat("@");
                case "e" -> codificado.concat("#");
                case "i" -> codificado.concat("$");
                case "o" -> codificado.concat("%");
                case "u" -> codificado.concat("*");
                default -> codificado.concat(texto.substring(i, i + 1));
            };
        }
        return codificado;
    }
}
