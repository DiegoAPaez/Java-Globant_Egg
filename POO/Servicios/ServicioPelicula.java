package Servicios;

import Entidades.Pelicula;

import java.util.Scanner;

public class ServicioPelicula {
    Pelicula nuevaPelicula = new Pelicula();
    Scanner leer = new Scanner(System.in);
    public void crearPelicula(){
        System.out.println("Ingrese el titulo");
        nuevaPelicula.setTitulo(leer.nextLine());
        System.out.println("Ingrese el genero");
        nuevaPelicula.setGenero(leer.nextLine());
        System.out.println("Ingrese el anio");
        nuevaPelicula.setAnio(leer.nextInt());
        System.out.println("Ingrese duracion (minutos)");
        nuevaPelicula.setDuracion(leer.nextInt());
    }
}
