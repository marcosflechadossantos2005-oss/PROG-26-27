package ud2.ejercicios;

import java.util.Scanner;

/** @author Flecha */
public class E0204_CasiCero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número decimal: ");
        double usrNum = sc.nextDouble();
        sc.close();

        if (usrNum != 0 && usrNum < 1 && usrNum > -1) {
            System.out.println("Es un número casi-cero");
        } else {
            System.out.println("No es un número casi-cero");
        }
    }
}
