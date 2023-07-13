package EjerciciosApp;

import Entidades.Cancion;

public class EjCancion {
    public static void main(String[] args) {
        Cancion nuevaCancion = new Cancion();
        nuevaCancion.setAutor("Ke Personajes");
        nuevaCancion.setTitulo("Pobre Corazon");
        System.out.println(nuevaCancion.toString());
    }
}
