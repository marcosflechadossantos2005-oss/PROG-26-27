package ud2.ejercicios;

import java.util.Scanner;

/** @author Flecha */
public class E0205 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce primer número: ");
        int num1 = sc.nextInt();
        System.out.print("Introduce segundo número: ");
        int num2 = sc.nextInt();
        sc.close();

        if (num1 > num2) {
            System.out.println(num1 + " > " + num2);
        } else {
            System.out.println(num2 + " > " + num1);
        }
    }
}
