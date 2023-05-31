package introjava;
import java.util.Scanner;

/**
 *
 * @author diego
 */
public class IntroJava {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String nombre;
        System.out.println("Ingresa tu nombre");
        nombre = leer.next();
        System.out.println("Hola " + nombre + "! estas programando en Java");
    }
    
}
