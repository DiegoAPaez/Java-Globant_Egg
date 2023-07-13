package Servicios;

import Entidades.Movil;

import java.util.Scanner;

public class ServicioMovil {
    Movil movil = new Movil();
    Scanner leer = new Scanner(System.in);
    public void cargarCelular(){
        // marca, precio, modelo, memoriaRam, almacenamiento y codigo
        System.out.println("Ingrese la marca");
        movil.setMarca(leer.nextLine());
        System.out.println("Ingrese el precio");
        movil.setPrecio(leer.nextDouble());
        System.out.println("Ingrese el modelo");
        leer.nextLine();
        movil.setModelo(leer.nextLine());
        System.out.println("Ingrese la memoria RAM");
        movil.setMemoriaRam(leer.nextInt());
        System.out.println("Ingrese el almacenamiento");
        movil.setAlmacenamiento(leer.nextInt());
        ingresarCodigo();
    }
    public void ingresarCodigo(){
        System.out.println("Ingrese el codigo de 7 numeros");
        leer.nextLine();
        String numsCodigo = leer.nextLine();

        int[] codigo = new int[7];
        for (int i = 0; i < 7; i++) {
            codigo[i] = Integer.parseInt(numsCodigo.substring(i,i+1));
        }
        movil.setCodigo(codigo);
    }

    @Override
    public String toString() {
        return movil.toString();
    }
}
