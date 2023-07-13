package Servicios;

import Entidades.Cadena;

public class ServicioCadena {
    Cadena nuevaCadena = new Cadena();
    int longitud = nuevaCadena.getLongitud();
    String frase = nuevaCadena.getFrase();
    public void mostrarVocales() {
        int vocales = 0;
        for (int i = 0; i < longitud; i++) {
            if (frase.charAt(i) == 'a' || frase.charAt(i) == 'e' || frase.charAt(i) == 'i' || frase.charAt(i) == 'o'|| frase.charAt(i) == 'u'  ){
                vocales++;
            }
        }
        System.out.println("La frase ingresada contiene " + vocales + " vocales");
    }
    public void invertirFrase() {
        for (int i = longitud - 1; i >= 0 ; i--) {
            System.out.print(frase.charAt(i));
        }
        System.out.print("\n");
    }
    public void vecesRepetido(String letra) {
        int repeticiones = 0;
        for (int i = 0; i < longitud; i++) {
            String nuevaLetra = frase.substring(i,i+1);
            if(nuevaLetra.equals(letra)) {
                repeticiones++;
            }
        }
        System.out.println("El caracter " + letra + " se encuentra repedido " + repeticiones + " veces.");
    }
    public void compararLongitud(String frase){
        int nuevaLong = frase.length();
        System.out.println("La longitud de la frase existente es de " + nuevaCadena.getLongitud() + " caracteres, mientras que la nueva frase contiene " + nuevaLong + " caracteres.");
    }
    public void unirFrases(String frase) {
        String nuevaFrase = nuevaCadena.getFrase().concat(" ");
        nuevaFrase = nuevaFrase.concat(frase);
        System.out.println("nuevaFrase = " + nuevaFrase);
    }
    public void reemplazar(String letra)  {
        String nuevaFrase = "";
        for (int i = 0; i < longitud; i++) {
            if(nuevaCadena.getFrase().charAt(i) == 'a') {
                nuevaFrase = nuevaFrase.concat(letra);
            } else {
                nuevaFrase = nuevaFrase.concat(frase.substring(i,i+1));
            }
        }
        System.out.println("nuevaFrase = " + nuevaFrase);
    }
    public boolean contiene(String letra) {
        boolean contieneLetra = false;
        for (int i = 0; i < longitud; i++) {
            if (frase.substring(i,i+1).equals(letra)) {
                contieneLetra = true;
                break;
            }
        }
        return contieneLetra;
    }
}