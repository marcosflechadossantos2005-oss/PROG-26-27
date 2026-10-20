package ud2.ejercicios.funciones;

/** @author Flecha */
public class Rango {
    public static void rango(int num1, int num2) {
        if (num1 > num2) {
            for (int i = num2; i <= num1; i++) {
                System.out.println(num2++);
            }
        } else {
            for (int i = num1; i <= num2; i++) {
                System.out.println(num1++);
            }
        }

    }

    public static void main(String[] args) {
        rango(19, 6);
        rango(2, 9);
    }
}
