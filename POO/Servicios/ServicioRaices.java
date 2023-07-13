package Servicios;

import Entidades.Raices;

public class ServicioRaices {
    Raices instanciaRaices = new Raices(1,2,-8);
    double a = instanciaRaices.getA();
    double b = instanciaRaices.getB();
    double c = instanciaRaices.getC();
    public double getDiscriminante(){
        return (Math.pow(b,2)) - 4 * a * c;
    }
    public boolean tieneRaices(){
        return getDiscriminante() >= 0;
    }
    public boolean tieneRaiz(){
        return getDiscriminante() == 0;
    }
    public void obtenerRaices(){
        if (tieneRaices()) {
            double solucionA = (-b + (Math.sqrt( Math.pow(b,2) - (4 * a * c)))) / (2 * a);
            double solucionB = (-b - (Math.sqrt( Math.pow(b,2) - (4 * a * c)))) / (2 * a);
            System.out.println("Solucion A = " + solucionA);
            System.out.println("Solucion B = " + solucionB);
        }
    }
    public void obtenerRaiz(){
        if (tieneRaiz()) {
            double solucion = (-b + (Math.sqrt( Math.pow(b,2) - (4 * a * c)))) / (2 * a);
            System.out.println("Solucion = " + solucion);
        }
    }
    public void calcular(){
        if (tieneRaiz() || tieneRaices()) {
            obtenerRaices();
            obtenerRaiz();
        } else {
            System.out.println("No esxiste una solucion");
        }
    }


}
