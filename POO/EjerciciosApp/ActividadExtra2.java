package EjerciciosApp;

import Servicios.ServicioAlquiler;
import Servicios.ServicioPelicula;

import java.util.Arrays;
import java.util.Scanner;

public class ActividadExtra2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de peliculas");
        int nPeliculas = leer.nextInt();

        ServicioPelicula[] listadoPelicula = new ServicioPelicula[nPeliculas];
        ServicioAlquiler[] listadoAlquileres = new ServicioAlquiler[nPeliculas];

        for (int i = 0; i < nPeliculas; i++) {
            listadoPelicula[i] = new ServicioPelicula();
            listadoPelicula[i].crearPelicula();
        }

    }
}
