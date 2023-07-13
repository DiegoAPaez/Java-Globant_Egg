package Servicios;

import Entidades.Java;

import java.util.Scanner;

public class ServicioJava {
    Java nuevoMes = new Java();
    Scanner leer = new Scanner(System.in);
    public void adivaMes() {
        String mes = "";

        if (mes.equals("")) {
            System.out.println("Adivine el mes secreto. Introduzca el nombre del mes en minúsculas:");
            mes = leer.nextLine();
        } else {
            mes = leer.nextLine();
        }

        if (mes.equals(nuevoMes.getMesSecreto())) {
            System.out.println("¡Ha acertado!");
        } else {
            System.out.println("No ha acertado. Intente adivinarlo introduciendo otro mes:");
            adivaMes();
        }
    }
    public void generarMesSecreto() {
        nuevoMes.setMesSecreto();
    }
}
