package Servicios;

import Entidades.Persona2;

import java.util.Date;
import java.util.Scanner;

public class ServicioPersona2 {
    Persona2 instancia = new Persona2();
    Scanner leer = new Scanner(System.in);
    public void crearPersona(){
        System.out.println("Ingrese el nombre de la persona.");
        String nombre = leer.nextLine();
        System.out.println("Ingresar dia, mes y anio de nacimiento.");
        int dia = leer.nextInt();
        int mes = (leer.nextInt()) - 1;
        int anio = leer.nextInt();
        Date nacimiento = new Date(anio,mes,dia);

        instancia.setNombre(nombre);
        instancia.setFechaNacimiento(nacimiento);
    }
    public void calcularEdad() {
        Date fechaActual = new Date();
        System.out.println("La persona tiene " + (fechaActual.getYear() - instancia.getFechaNacimiento().getYear()) + " años.");
    }
    public void menorQue(int edad) {
        boolean menor = false;
        if (instancia.getFechaNacimiento().getYear() < edad) {
            menor = true;
        } else {
            menor = false;
        }
        System.out.println("La persona es menor de " + edad + ": " + menor);
    }
    public void mostrarPersona(){
        System.out.println(instancia.toString());
    }
}
