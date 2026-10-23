package ud2.ejercicios.funciones;

/** @author Flecha */
public class Fibbonacci {
    static int fibbonacci(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return fibbonacci(n - 1) + fibbonacci(n - 2);
    }

    public static void main(String[] args) {
        final int repeticiones = 13;
        for (int i = 0; i < repeticiones; i++) {
            System.out.println(fibbonacci(i) + " ");
        }
    }
}
