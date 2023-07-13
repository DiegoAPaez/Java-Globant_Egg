package Entidades;

import java.util.Scanner;

public class Operacion {
    private double numero1;
    private double numero2;

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public Operacion(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    public Operacion() {
    }

    public void crearOperacion(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar un valor para numero 1");
        setNumero1(leer.nextDouble());
        System.out.println("Ingresar un valor para numero 2");
        setNumero2(leer.nextDouble());
    }
    public void sumar(){
        System.out.println("La suma de los numeros es = " + (numero1 + numero2));
    }
    public void restar(){
        System.out.println("La resta de los numeros es = " + (numero1 - numero2));
    }
    public double multiplicar(){
        double resultado = 0;
        if (this.numero1 != 0 && this.numero2 != 0) {
            resultado = this.numero1 * this.numero2;
        } else {
            System.out.println("Esta multiplicando un numero por 0, el resultado es ");
        }
        return resultado;
    }
    public double dividir(){
        double resultado = 0.00;
        if (this.numero1 != 0 && this.numero2 != 0) {
            resultado =this.numero1 / this.numero2;
        } else {
            System.out.println("No es posible dividir un numero por 0, el resultado es ");
        }
        return resultado;
    }
}
/*
Crear una clase llamada Entidades.Operacion que tenga como atributos privados numero1 y
numero2. A continuación, se deben crear los siguientes métodos:
  a) Método constructor con todos los atributos pasados por parámetro.
  b) Metodo constructor sin los atributos pasados por parámetro.
  c) Métodos get y set.
  d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda
en los atributos del objeto.
  e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
  f) Método restar(): calcular la resta de los números y devolver el resultado al main.
  g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error.
Si no, se hace la multiplicación y se devuelve el resultado al main
  h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
una división por cero, el método devuelve 0 y se le informa al usuario el error se le
informa al usuario. Si no, se hace la división y se devuelve el resultado al main.
*/
