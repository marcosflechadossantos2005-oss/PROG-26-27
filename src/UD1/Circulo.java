package UD1;

import java.util.Scanner;

/**@author Flecha */

public class Circulo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el radio del círculo: ");
        double radio = sc.nextDouble();
        sc.close();

        double perimetro = 2 * Math.PI * radio;
        double area = Math.PI * Math.pow(radio, 2);
        
        System.out.printf("El perímetro es: %.2f %n", perimetro);
        System.out.printf("El área es: %.2f %n", area);
    }
}
