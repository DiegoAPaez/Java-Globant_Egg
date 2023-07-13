package Entidades;

import java.util.Scanner;

public class Circunferencia {
    private double radio;

    public double getRadio() {
        return radio;
    }

    Scanner leer = new Scanner(System.in);
    public void setRadio() {
        System.out.println("Ingresar el radio");
        this.radio = leer.nextDouble();
    }

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public void crearCircunferencia(){
        System.out.println("Ingrese el radio de la circunferencia:");
        this.radio = leer.nextDouble();
    }
    public void area() {
        System.out.println("El area es = " + (Math.PI * Math.pow(radio,2)));
    }
    public void perimetro() {
        System.out.println("El perimetro es = " + (2 * Math.PI * radio));
    }

}
/*
Declarar una clase llamada Entidades.Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
  a) Método constructor que inicialice el radio pasado como parámetro.
  b) Métodos get y set para el atributo radio de la clase Entidades.Circunferencia.
  c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
  objeto.
  d) Método area(): para calcular el área de la circunferencia (𝐀𝐫𝐞𝐚 = 𝛑 ∗ 𝐫𝐚𝐝𝐢𝐨𝟐).
  e) Método perimetro(): para calcular el perímetro (𝐏𝐞𝐫𝐢𝐦𝐞𝐭𝐫𝐨 = 𝟐 ∗ 𝛑 ∗ 𝐫𝐚𝐝𝐢𝐨).
*/
