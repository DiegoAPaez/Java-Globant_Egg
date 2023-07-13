package Servicios;

import Entidades.NIF;

import java.util.Scanner;

public class ServicioNIF {
    NIF nuevoNIF = new NIF();
    private String nif;

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    Scanner leer = new Scanner(System.in);
    public void crearNif(){
        System.out.println("Ingrese el DNI");
        nuevoNIF.setDni(leer.nextLong());
        setNif( nif = String.valueOf(nuevoNIF.getDni()) + "-" + buscarLetra() );
    }
    public String buscarLetra(){
        String[] letras = {"T", "R", "W", "A", "GT",
                            "M", "Y", "F", "P", "D",
                            "X", "B", "N", "J", "Z",
                            "S","Q", "V", "H", "L",
                            "C", "K", "E"};
        long indice = nuevoNIF.getDni() % 23;
        String letra = letras[(int) indice];
        return letra;
    }
    public void mostrar() {
        System.out.println(getNif());
    }
}
