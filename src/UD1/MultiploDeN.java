package ud1;

import java.util.Scanner;

/** @author Flecha */

public class MultiploDeN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce valor de n: ");
        int n = sc.nextInt();
        System.out.print("Introduce valor de m: ");
        int m = sc.nextInt();
        sc.close();

        int valorASumar = ((-(n % m) + m) % m);

        String numero = "A " + n + " hay que sumarle " + valorASumar + " para que sea múltiplo de " + m;
        System.out.println(numero);
    }
}
