package UD1;

import java.util.Scanner;

public class ConvertirExpresiones {
    public static void main(String[] args) {
        double a = (3 / 2.0) + (4 / 3.0);
        System.out.println("a: " + a);

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce valor de X e Y (puedes usar coma como separador de cimal): ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        sc.close();

        double b = 1 / (x - 5) - 3 * x * y / 4;
        System.out.println("b: " + b);
    }
}
