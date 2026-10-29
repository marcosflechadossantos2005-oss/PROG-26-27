package ud2.ejercicios.excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/** @author Flecha */
public class LeerHastaCorrecto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero = 0;
        boolean lecturaCorrecta = false;
        System.out.println("Escribe un número entero: ");
        do {
            try {
                numero = sc.nextInt();
                lecturaCorrecta = true;
            } catch (InputMismatchException e) {
                System.out.println("Entrada no válida. Introduce un número entero.");
                sc.next();
            }
        } while (!lecturaCorrecta);

        System.out.println("Número introducido: " + numero);
        sc.close();
    }
}
