package EjerciciosApp;

import Servicios.ServicioCliente;
import Servicios.ServicioRutina;

public class DesafioGrupal {
    public static void main(String[] args) {
        ServicioCliente clientes = new ServicioCliente();
        ServicioRutina rutinas = new ServicioRutina();

        clientes.registrarCliente();
        //clientes.registrarCliente();
        //clientes.registrarCliente();
        //clientes.registrarCliente();
        //clientes.registrarCliente();

        //rutinas.crearRutinas();
        //rutinas.crearRutinas();
        //rutinas.crearRutinas();
        //rutinas.crearRutinas();
        //rutinas.crearRutinas();

        clientes.obtenerClientes();
        //rutinas.obtenerRutinas();
        //clientes.eliminarCliente(12345);
        clientes.actualizarCliente(12345, "Juana",23,165,54.4, "Llegar al verano");
        clientes.obtenerClientes();
    }
}
