package Servicios;

import Entidades.Curso;

import java.util.Scanner;

public class ServicioCurso {
    Curso curso = new Curso();
    Scanner leer = new Scanner(System.in);
    public void cargarAlumnos(){
        String[] alumnos = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el nombre del alumno " + i);
            leer.nextLine();
            alumnos[i] = leer.next();
        }
        curso.setAlumnos(alumnos);
    }
    public void crearCurso(){
        System.out.println("Indica el nombre del curso");
        curso.setNombreCurso(leer.nextLine());
        System.out.println("Indica la cantidad de horas por dia");
        curso.setCantidadHorasPorDia(leer.nextInt());
        System.out.println("Indica la cantidad de dias por semana");
        curso.setCantidadDiasPorSemana(leer.nextInt());
        System.out.println("Indique el turno (mañana-tarde)");
        leer.nextLine();
        curso.setTurno(leer.nextLine());
        System.out.println("Indique el valor por hora");
        curso.setPrecioPorHora(leer.nextDouble());
        cargarAlumnos();
    }
    public void calcularGananciaSemanal(){
        double ingresoDiario = curso.getPrecioPorHora() * curso.getCantidadHorasPorDia() * 5;
        double ingresoSemanal = ingresoDiario * curso.getCantidadDiasPorSemana();
        System.out.println("La ganacia semanal es de  = $" + ingresoSemanal);
    }
}
