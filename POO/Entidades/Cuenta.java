package Entidades;

import java.util.Scanner;

public class Cuenta {
    private int numeroCuenta;
    private long dNI;
    private int saldoActual;

    Scanner leer = new Scanner(System.in);

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getdNI() {
        return dNI;
    }

    public void setdNI(long dNI) {
        this.dNI = dNI;
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }

    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, long dNI, int saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.dNI = dNI;
        this.saldoActual = saldoActual;
    }

    public void crearCuenta () {
        System.out.println("Ingrese su DNI");
        this.dNI = leer.nextLong();
        System.out.println("Ingrese su numero de cuenta");
        this.numeroCuenta = leer.nextInt();
        System.out.println("Ingrese su saldo");
        this.saldoActual = leer.nextInt();
    }

    public void ingresar (double ingreso) {
        System.out.println("Se han ingresado $" + ingreso);
        this.saldoActual += ingreso;
    }
    public void retirar (double retiro) {
        if (this.saldoActual < retiro) {
            System.out.println("El retiro supera su saldo, el maximo disponible es = $" + this.saldoActual);
            this.saldoActual = 0;
        } else {
            System.out.println("Se han retirado $" + retiro);
            this.saldoActual -= retiro;
        }
    }
    public void extraccionRapida() {
        System.out.println("Ingrese el monto a retirar");
        int retirar = leer.nextInt();
        if (retirar <= (this.saldoActual * 0.2)) {
            System.out.println("Se han retirado $" + retirar);
            this.saldoActual -= retirar;
        } else {
            System.out.println("No es posible retirar mas del 20% de su saldo actual");
        }
    }

    public void consultarSaldo () {
        System.out.println("Su saldo actual es = $" + getSaldoActual());
    }
    public void consultarDatos () {
        System.out.println("Su numero de cuenta es = " + getNumeroCuenta());
        System.out.println("Su DNI es = " + getdNI());
        System.out.println("Su saldo actual es = $" + getSaldoActual());
    }
}
/*
Realizar una clase llamada Entidades.Cuenta (bancaria) que debe tener como mínimo los atributos:
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero).
Las operaciones asociadas a dicha clase son:
  a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
  b) Agregar los métodos getters y setters correspondientes
  c) Metodo para crear un objeto Entidades.Cuenta, pidiéndole los datos al usuario.
  d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
y se la sumara a saldo actual.
  e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se
la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
  f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.
  g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
  h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta.
*/