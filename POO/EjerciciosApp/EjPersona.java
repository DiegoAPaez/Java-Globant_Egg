package EjerciciosApp;

import Entidades.Persona;

public class EjPersona {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Pablo",30,"H",65,1.7);
        Persona persona2 = new Persona("Jose",15,"O",52,1.64);
        Persona persona3 = new Persona("Anibal",60,"H",76,1.74);
        Persona persona4 = new Persona("Lucia",21,"M",55,1.58);

        int[] iMC = new int[4];
        iMC[0] = persona1.calcularIMC();
        iMC[1] = persona2.calcularIMC();
        iMC[2] = persona3.calcularIMC();
        iMC[3] = persona4.calcularIMC();

        boolean[] mayores = new boolean[4];
        mayores[0] = persona1.esMayorDeEdad();
        mayores[1] = persona2.esMayorDeEdad();
        mayores[2] = persona3.esMayorDeEdad();
        mayores[3] = persona4.esMayorDeEdad();

        iMCPersonas(iMC);
        sonMayores(mayores);
    }

    public static void iMCPersonas (int[] personas) {
        double bajoPeso = 0;
        double pesoIdeal = 0;
        double sobrePeso = 0;

        for (int i = 0; i < 4; i++) {
            if (personas[i] == -1) {
                bajoPeso++;
            } else if (personas[i] == 0) {
                pesoIdeal++;
            } else {
                sobrePeso ++;
            }
        }
        System.out.println("Personas con bajo peso = " + (bajoPeso / 4) * 100 + "%");
        System.out.println("Personas con peso ideal = " + (pesoIdeal / 4) * 100 + "%");
        System.out.println("Personas con sobrepeso = " + (sobrePeso / 4) * 100 + "%");
    }

    public static void sonMayores(boolean[] mayores) {
        double mayor = 0;
        double menor = 0;

        for (int i = 0; i < 4; i++) {
            if (mayores[i]) {
                mayor++;
            } else {
                menor++;
            }
        }
        System.out.println("Personas mayores de edad = " + (mayor / 4) * 100 + "%");
        System.out.println("Personas menores de edad = " + (menor / 4) * 100 + "%");
    }
}
