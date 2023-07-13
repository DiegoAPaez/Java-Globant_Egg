package Servicios;

import Entidades.Rutina;

import java.util.ArrayList;
import java.util.Scanner;

public class ServicioRutina {
    private static ArrayList<Rutina> rutinas = new ArrayList<>(100);
    public ServicioRutina() {
    }
    Scanner scanner = new Scanner(System.in);
    public Rutina nuevaRutina(){
        System.out.println("Ingrese su ID");
        int id = scanner.nextInt();
        System.out.println("Ingrese su nombre");
        scanner.nextLine();
        String nombre = scanner.nextLine();
        System.out.println("Ingrese la duracion");
        int duracion = scanner.nextInt();
        System.out.println("Ingrese el nivel de dificultad");
        int nivelDificultad = scanner.nextInt();
        System.out.println("Ingrese la descripcion");
        scanner.nextLine();
        String descripcion = scanner.nextLine();

        return new Rutina(id,nombre,duracion,nivelDificultad,descripcion);
    }
    public void crearRutinas(){
        rutinas.add(nuevaRutina());
    }
    public void obtenerRutinas(){
        for (int i = 0; i < rutinas.size(); i++) {
            System.out.println(rutinas.get(i).toString());
        }
    }
    public void actualizarRutina(int id, String nombre, int duracion, int nivelDificultad, String descripcion){
        for (int i = 0; i < rutinas.size(); i++) {
            if (rutinas.get(i).getId() == id){
                Rutina actualizada = new Rutina(id, nombre, duracion, nivelDificultad, descripcion);
                rutinas.set(i, actualizada);
                System.out.println("Se ha actualizado la rutina del cliente " + rutinas.get(i).getNombre());
            }
        }
    }
    public void eliminarRutina(int id){
        for (int i = 0; i < rutinas.size(); i++) {
            if(id == rutinas.get(i).getId()) {
                System.out.println("Se ha eliminado la rutina " + rutinas.get(i).getNombre());
                rutinas.remove(i);
            }
        }
    }
}

/*
    private int id;
    private String nombre;
    private int duracion;
    private int nivelDificultad;
    private String descripcion;
*/
/*
crearRutina(Rutina rutina): recibe un objeto de tipo Rutina y lo agrega al sistema.
obtenerRutinas(): devuelve una lista con todas las rutinas registradas en el sistema.
actualizarRutina(int id, String nombre, int duracion, String nivelDificultad, String descripcion): recibe el identificador
de una rutina existente y los nuevos datos de la rutina, y actualiza la información correspondiente en el sistema.
eliminarRutina(int id): recibe el identificador de una rutina existente y la elimina del sistema.
*/