package Servicios;

import Entidades.Cliente;

import java.util.ArrayList;
import java.util.Scanner;

public class ServicioCliente {
    private static ArrayList<Cliente> clientes = new ArrayList<>(100);
    public ServicioCliente() {
    }
    Scanner scanner = new Scanner(System.in);

    public Cliente crearCliente(){
        System.out.println("Ingrese su ID");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingrese su nombre");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese su edad");
        int edad = scanner.nextInt();
        System.out.println("Ingrese su altura");
        int altura = scanner.nextInt();
        System.out.println("Ingrese su peso");
        double peso = scanner.nextDouble();
        System.out.println("Ingrese su objetivo");
        scanner.nextLine();
        String objetivo = scanner.nextLine();

        return new Cliente (id, nombre, edad, altura, peso, objetivo);
    }
    public void registrarCliente(){
        clientes.add(crearCliente());
    }
    public void obtenerClientes(){
        for (int i = 0; i < clientes.size(); i++) {
            System.out.println(clientes.get(i).toString());
        }
    }
    public void actualizarCliente(int id, String nombre, int edad, int altura, double peso, String objetivo){
        for (int i = 0; i < clientes.size(); i++) {
            if(id == clientes.get(i).getId()) {
                // clientes.get(i).setId(id);
                // clientes.get(i).setNombre(nombre);
                // clientes.get(i).setEdad(edad);
                // clientes.get(i).setAltura(altura);
                // clientes.get(i).setPeso(peso);
                // clientes.get(i).setObjetivo(objetivo);
                Cliente actualizado = new Cliente(id, nombre, edad, altura, peso, objetivo);
                clientes.set(i,actualizado);
                System.out.println("Se ha actualizado el cliente " + clientes.get(i).getNombre());
            }
        }
    }
    public void eliminarCliente(int id){
        for (int i = 0; i < clientes.size(); i++) {
            if(id == clientes.get(i).getId()) {
                System.out.println("Se ha eliminado el cliente " + clientes.get(i).getNombre());
                clientes.remove(i);
            }
        }
    }
}

/*
    private int id;
    private String nombre;
    private int edad;
    private int altura;
    private double peso;
    private String objetivo;
*/
