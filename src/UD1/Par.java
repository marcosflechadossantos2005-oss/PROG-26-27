package UD1;

import java.util.Scanner;

/** @author Flecha */

public class Par {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número entero: ");
        int num = sc.nextInt();
        sc.close();

        if (num % 2 == 0) {
            boolean esPar = true;
            System.out.println(esPar);
        } else {
            boolean esPar = false;
            System.out.println(esPar);
        }

    }
}
