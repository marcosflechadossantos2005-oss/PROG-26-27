package ud2.ejercicios.funciones;

import java.util.Scanner;

/** @author Flecha */
public class Eco {
    public static void eco(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("Eco...");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el número de repeticiones: ");
        int n = sc.nextInt();
        sc.close();

        eco(n);
    }
}
