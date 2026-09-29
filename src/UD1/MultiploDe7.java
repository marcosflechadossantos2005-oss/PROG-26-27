package ud1;

import java.util.Scanner;

/** @author Flecha */

public class MultiploDe7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int num = sc.nextInt();
        sc.close();

        int valorASumar = ((-(num % 7) + 7) % 7);
        
        String numero = "A " + num + " hay que sumarle " + valorASumar + " para que sea múltiplo de 7";
        System.out.println(numero);
    }
}
