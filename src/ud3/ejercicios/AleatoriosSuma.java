package ud3.ejercicios;

import java.nio.channels.Pipe.SourceChannel;
import java.util.Arrays;
import java.util.Random;

/** @author Flecha */
public class AleatoriosSuma {
    public static void main(String[] args) {
        final int LONGITUD = 10;
        final int MAXRANDOM = 100;
        int[] numeros = new int[LONGITUD];
        Random rnd = new Random();

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rnd.nextInt(MAXRANDOM) + 1;
        }

        System.out.println(Arrays.toString(numeros));
        int suma = 0;
        for (int numero : numeros) {
            suma += numero;
        }

        System.out.println("Suma: " + suma);

        System.out.println("Fin del programa");
    }
}
