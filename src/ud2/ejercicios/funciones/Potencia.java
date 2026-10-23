package ud2.ejercicios.funciones;

/** @author Flecha */
public class Potencia {
    static double calculoPotenciaIterativo(double a, int n) {
        double resultado = 0;
        for (int i = 0; i < n; i++) {
            resultado *= a;
        }
        return resultado;
    }

    static double calculoPotenciaRecusivo(double a, int n) {
        if (n == 0) {
            return 1;
        } else {
            return a * calculoPotenciaRecusivo(a, --n);
        }
    }

    public static void main(String[] args) {
        System.out.println(calculoPotenciaIterativo(2, 3));
        System.out.println(calculoPotenciaRecusivo(2, 3));
    }
}
