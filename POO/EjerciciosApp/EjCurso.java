package EjerciciosApp;

import Servicios.ServicioCurso;

public class EjCurso {
    public static void main(String[] args) {
        ServicioCurso nuevoCurso = new ServicioCurso();
        nuevoCurso.crearCurso();
        nuevoCurso.calcularGananciaSemanal();
    }
}
