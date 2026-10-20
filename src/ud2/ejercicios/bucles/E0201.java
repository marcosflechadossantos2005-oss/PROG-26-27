package ud2.ejercicios.bucles;

import java.util.Scanner;

/** @author Flecha */
public class E0201 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número para saber si es par o impar: ");
        int usrNum = sc.nextInt();
        sc.close();

        if (usrNum % 2 == 0) {
            System.out.println("El número " + usrNum + " es PAR.");
        } else {
            System.out.println("El número " + usrNum + " es IMPAR.");
        }
    }
}
