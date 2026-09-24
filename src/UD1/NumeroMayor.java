package ud1;

import java.util.Random;

/** @author Flecha */

public class NumeroMayor {
    public static void main(String[] args) {
        final int NUM_INI = 5;
        final int NUM_FIN = 10;

        int numRandom = (int) (NUM_INI + Math.random() * (NUM_FIN - NUM_INI + 1));

        Random rnd = new Random();
        int numRandom2 = rnd.nextInt(NUM_INI, NUM_FIN + 1);
        int numRandom3 = rnd.nextInt(NUM_INI, NUM_FIN + 1);

        System.out.println("Número1: " + numRandom);
        System.out.println("Número2: " + numRandom2);

        int mayor = numRandom > numRandom2 ? numRandom : numRandom2;
        mayor = mayor > numRandom3 ? mayor : numRandom3;

        System.out.println("Mayor: " + mayor);

    }
}
