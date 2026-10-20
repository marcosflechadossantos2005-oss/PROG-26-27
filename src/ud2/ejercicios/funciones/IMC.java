package ud2.ejercicios.funciones;

import java.util.Scanner;

/** @author Flecha */
public class IMC {
    static double imc(double kg, double cm) {
        double imc = kg / Math.pow(cm, 2);
        return imc;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca la altura en cm: ");
        double cm = sc.nextDouble();
        System.out.print("Introduzca el peso en kg: ");
        double kg = sc.nextDouble();

        boolean pesoValido = false;
        boolean alturaValida = false;
        
    }
}
