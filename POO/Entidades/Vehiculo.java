package Entidades;

public class Vehiculo {
    private String marca;
    private String modelo;
    private int anio;
    private String tipo;

    private double metrosRecorridos;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, int anio, String tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double moverse(int secs, String tipo) {
        if (tipo.equals("automovil")) {
            metrosRecorridos = 3 * secs;
        } else if (tipo.equals("motocicleta")) {
            metrosRecorridos = 2 * secs;
        } else {
            metrosRecorridos = 1 * secs;
        }
        return metrosRecorridos;
    }
    public double frenar(String tipo) {
        if (tipo.equals("bici")) {
            return metrosRecorridos;
        } else {
            return metrosRecorridos + 2;
        }
    }
}
/*
Crear una clase "Vehículo" con atributos como "marca", "modelo", "año" y "tipo" (En tipo, vamos a indicar si es un
automóvil, una motocicleta, o una bicicleta). El vehículo debe tener los métodos de moverse y frenar:
 Moverse: Es la cantidad de metros que avanzará por segundo.
 Frenar: Dejará de avanzar y se frenará 2 metros más adelante. En el caso de la bicicleta, se frenará y no avanzará
más metros.
Referencias:
 Un automóvil avanza 3 metros por segundo.
 Una motocicleta avanza 2 metros por segundo.
 Una bicicleta avanza 1 metro por segundo.
Una vez realizado el programa, crear 3 vehículos diferentes (entre todos elegir que tipo de vehículo es), y mostrar por
pantalla cuanto avanzan si se mueve durante 5 segundos, durante 10 segundos y durante 1 minuto. Luego mostrar que
vehículo logró llegar más lejos luego de frenar, tras avanzar durante 5 minutos, y cual fue la cantidad de metros que
avanzó.
 */