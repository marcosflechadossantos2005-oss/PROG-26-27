package ud2.ejercicios.bucles;

import java.util.Scanner;

/** @author Flecha */
public class E0203 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce primer número: ");
        int num1 = sc.nextInt();
        System.out.print("Introduce segundo número: ");
        int num2 = sc.nextInt();
        sc.close();

        if (num1 > num2) {
            System.out.println("El mayor es: " + num1);
        } else {
            System.out.println("El mayor es: " + num2);
        }
    }
}
