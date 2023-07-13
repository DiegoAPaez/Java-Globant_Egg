package Servicios;

import Entidades.Ahorcado;

import java.util.Scanner;
import java.util.Vector;

public class ServicioAhorcado {
    Ahorcado n = new Ahorcado();
    Scanner leer = new Scanner(System.in);

    private String[] utilizadas;

    public String[] getUtilizadas() {
        return utilizadas;
    }

    public void setUtilizadas(int tamano) {
        this.utilizadas = new String[tamano];
        for (int i = 0; i < tamano; i++) {
            utilizadas[i] = "-";
        }
    }

    public void crearJuego(){
        String palabra;
        System.out.println("Ingrese la palabra");
        palabra = leer.nextLine();
        n.setPalabra(palabra);
        System.out.println("Ingrese el maximo de jugadas");
        n.setJugadasMax(leer.nextInt());
        n.setLetrasEncontradas(0);
        leer.nextLine();
        setUtilizadas(n.getJugadasMax() * 2);
    }

    public void longitud(){
        System.out.println("La longitud de la palabra es de " + n.getPalabra().length + " caracteres.");
    }
    public void buscar(String letra){
        for (int i = 0; i < n.getPalabra().length; i++) {
            if (n.getPalabra()[i].equals(letra)){
                System.out.println("La letra " + letra + " se encuentra en la palabra.");
            }
        }
    }
    public void encontradas(String letra){

        int formaParte = 0;
        int letrasUtilizadas = 0;
        for (int i = 0; i < n.getPalabra().length; i++) {
            if (n.getPalabra()[i].equals(letra)){
                n.setLetrasEncontradas(n.getLetrasEncontradas() + 1);
                formaParte++;
                utilizadas[letrasUtilizadas] = letra;
                letrasUtilizadas++;
            }
        }
        if (formaParte > 0) {
            System.out.println("La letra " + letra + " se encuentra " + formaParte + " vez/veces en la palabra.");
        } else {
            n.setJugadasMax(n.getJugadasMax() - 1);
        }

        System.out.println("Han sido encontradas " + n.getLetrasEncontradas() + " letras.");
        System.out.println("Aun falta encontrar " + (n.getPalabra().length - n.getLetrasEncontradas()) + " letras.");

    }
    public void intentos(){
        System.out.println("Todavia te quedan " + n.getJugadasMax() + " intentos.");
    }
    public void juego(){
        crearJuego();
        String letra;
        while ((n.getJugadasMax() > 0) || (n.getLetrasEncontradas() != n.getPalabra().length)) {
            System.out.println("Ingrese una letra:");
            letra = leer.nextLine();
            longitud();
            buscar(letra);
            encontradas(letra);
            intentos();
        }
    }
}
