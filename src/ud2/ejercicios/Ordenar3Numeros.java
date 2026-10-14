package ud2.ejercicios;

import java.util.Scanner;

/** @author Flecha */
public class Ordenar3Numeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce 3 números: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        sc.close();

        int mayor = 0;
        int medio = 0;
        int menor = 0;

        if (num1 > num2 && num1 > num3) {
            mayor = num1;
            if (num2 > num3) {
                medio = num2;
                menor = num3;
            } else {
                medio = num3;
                menor = num2;
            }
        } else if (num2 > num1 && num2 > num3) {
            mayor = num2;
            if (num1 > num3) {
                medio = num1;
                menor = num3;
            } else {
                medio = num3;
                menor = num1;
            }
        } else if (num3 > num1 && num3 > num2) {
            mayor = num3;
            if (num1 > num2) {
                medio = num1;
                menor = num2;
            } else {
                medio = num2;
                menor = num1;
            }
        }

        System.out.println(mayor + " > " + medio + " > " + menor);

    }
}
