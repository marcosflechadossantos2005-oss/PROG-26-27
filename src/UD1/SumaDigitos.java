package ud1;

import java.util.Scanner;

/** @author Flecha */

public class SumaDigitos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número de 3 cifras: ");
        int usrNum = sc.nextInt();
        sc.close();

        int dig1 = usrNum % 10;
        int dig2 = (usrNum % 100 - dig1) / 10;
        int dig3 = (usrNum % 1000 - dig2 - dig1) / 100;

        int suma = dig1 + dig2 + dig3;

        System.out.println("La suma de los dígitos de " + usrNum + " es: " + suma);
    }
}
