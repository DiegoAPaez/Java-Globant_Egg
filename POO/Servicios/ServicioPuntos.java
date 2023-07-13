package Servicios;

import Entidades.Puntos;

import java.util.Scanner;

public class ServicioPuntos {
    Puntos nuevoPuntos = new Puntos();
    Scanner leer = new Scanner(System.in);
    public void crearPuntos(){
        System.out.println("Ingresa el valor para X1");
        nuevoPuntos.setX1(leer.nextInt());
        System.out.println("Ingresa el valor para Y1");
        nuevoPuntos.setY1(leer.nextInt());
        System.out.println("Ingresa el valor para X2");
        nuevoPuntos.setX2(leer.nextInt());
        System.out.println("Ingresa el valor para Y2");
        nuevoPuntos.setY2(leer.nextInt());
    }
    public void distanciaEntrePuntos(){
        double distancia = Math.sqrt(Math.pow(nuevoPuntos.getX2() - nuevoPuntos.getX1() ,2) + Math.pow(nuevoPuntos.getY2() - nuevoPuntos.getY1(), 2));
        System.out.println("La distancia entre los dos puntos es = " + distancia);
    }
}
