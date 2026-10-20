package ud2.ejercicios.bucles;

import java.util.Scanner;

/** @author Flecha */
public class Bisiesto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un año: ");
        int numAno = sc.nextInt();
        sc.close();

        // año bisiesto es divisible entre 4
        // si es secular tiene que ser divisiblre entre 100 y 400

        boolean esMultiploDeCien = (numAno % 100 == 0) ? true : false;
        boolean esMultiploDeCuatrocientos = (numAno % 400 == 0) ? true : false;
        boolean esMultiploDeCUatro = (numAno % 4 == 0) ? true : false;

        if (esMultiploDeCien == true && esMultiploDeCuatrocientos == true) {
            System.out.println("Es bisiesto");
        } else if (esMultiploDeCUatro == true && esMultiploDeCien == false) {
            System.out.println("Es bisiesto");
        } else {
            System.out.println("No es bisiesto");
        }
    }
}
