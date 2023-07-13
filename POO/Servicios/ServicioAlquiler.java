package Servicios;

import Entidades.Alquiler;

import java.util.Scanner;
import java.util.Date;

public class ServicioAlquiler {
    Alquiler nuevoAlquiler = new Alquiler();
    Scanner leer = new Scanner(System.in);

    public void crearAlquiler(){
        System.out.println("Ingrese la fecha de finalizacion del alquiler");
        int dia = leer.nextInt();
        int mes = leer.nextInt();
        int anio = leer.nextInt();
        Date fechaFin = new Date(anio, mes, dia);
        nuevoAlquiler.setFechaFin(fechaFin);
        System.out.println("Ingrese el nombre de la pelicula");
        nuevoAlquiler.setPeliculaAlquilada(leer.nextLine());
        leer.nextLine();
        System.out.println("Ingrese el precio");
        nuevoAlquiler.setPrecio(leer.nextDouble());
    }
}
