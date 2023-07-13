package Servicios;

import Entidades.Matematica;

public class ServicioMatematica {
    Matematica matematica = new Matematica();
    public double devolverMayor(){
        if (matematica.getNumero1() > matematica.getNumero2()) {
            return matematica.getNumero1();
        } else {
            return matematica.getNumero2();
        }
    }
    public void calcularPotencia(){
        int num1 = (int) Math.round(matematica.getNumero1());
        int num2 = (int) Math.round(matematica.getNumero2());
        if (num1 > num2) {
            System.out.println(num1 + " elevado por " + num2 + " es igual a: " + (Math.pow(num1,num2)));
        } else {
            System.out.println(num2 + " elevado por " + num1 + " es igual a: " + (Math.pow(num2,num1)));
        }
    }
    public void calculaRaiz(){
        int num1 = (int) Math.abs(matematica.getNumero1());
        int num2 = (int) Math.abs(matematica.getNumero2());
        if (num1 > num2) {
            System.out.println("La raiz cuadrada de " + num2 + " es: " + Math.sqrt(num2));
        } else {
            System.out.println("La raiz cuadrada de " + num1 + " es: " + Math.sqrt(num1));
        }
    }

    public ServicioMatematica() {
        matematica.setNumero1(Math.random() * 10);
        matematica.setNumero2(Math.random() * 10);
    }
}
