package ud2.ejercicios.funciones;

/** @author Flecha */
public class Potencia {
    static double calculoPotenciaIterativo(double a, int n) {
        double resultado = 0;
        if (a < 0) {
            resultado = 0;
        } else {
            resultado = Math.pow(a, n);
        }
        return resultado;
    }

    static double calculoPotenciaRecusivo(double a, int n) {
        double resultado = 0;
        while (n >= 0) {
            resultado = Math.pow(a, n);
        }
        return resultado;
    }

    public static void main(String[] args) {

    }
}
