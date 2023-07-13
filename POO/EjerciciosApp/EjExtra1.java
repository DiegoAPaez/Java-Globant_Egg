package EjerciciosApp;

import Entidades.Vehiculo;

public class EjExtra1 {

    public static void main(String[] args) {
        recorrerDistancia(5);
        recorrerDistancia(10);
        recorrerDistancia(60);

    }
    public static void recorrerDistancia(int segs){
        Vehiculo auto = new Vehiculo("AUDI", "A4" , 2015, "automovil");
        Vehiculo bici = new Vehiculo("TREK", "3900" , 2012, "bici");
        Vehiculo moto = new Vehiculo("YAMAHA", "R6" , 2020, "motocicleta");

        double distanciaAuto;
        double distanciaMoto;
        double distanciaBici;

        distanciaAuto = auto.moverse(segs, auto.getTipo()) + auto.frenar(auto.getTipo());
        distanciaMoto = moto.moverse(segs, moto.getTipo()) + moto.frenar(moto.getTipo());
        distanciaBici = bici.moverse(segs, bici.getTipo());

        System.out.println("El " + auto.getMarca() + " avanzo " + distanciaAuto + " metros.");
        System.out.println("El " + moto.getMarca() + " avanzo " + distanciaMoto + " metros.");
        System.out.println("El " + bici.getMarca() + " avanzo " + distanciaBici + " metros.");
    }


}
