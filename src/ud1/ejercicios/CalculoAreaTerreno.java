package ud1.ejercicios;

import java.util.Scanner;

public class CalculoAreaTerreno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce valor de la base de la Figura: ");
        double base = sc.nextDouble();
        System.out.print("Introduce el valor del lado pequeño de la Figura: ");
        double ladoPeque = sc.nextDouble();
        System.out.print("Introduce el valor del lado grande de la Figura: ");
        double ladoLargo = sc.nextDouble();

        double areaRectangulo = base * ladoPeque;
        double areaTriangulo = (base * (ladoLargo - ladoPeque)) / 2;

        double areaTotal = areaRectangulo + areaTriangulo;

        double hipotenusa = Math.sqrt(Math.pow((ladoLargo - ladoPeque), 2) + Math.pow(base, 2));

        double perimetro = base + ladoLargo + ladoPeque + hipotenusa;

        System.out.println("El área de la figura es de: " + String.format("%.2f", areaTotal) + " cm2");
        System.out.println("El perímetro de la figura es de: " + String.format("%.2f", perimetro) + " cm");

    }
}
