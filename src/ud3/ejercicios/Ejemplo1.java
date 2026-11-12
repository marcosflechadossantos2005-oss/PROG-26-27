package ud3.ejercicios;

import java.time.LocalDate;

public class Ejemplo1 {
    public static void main(String[] args) {
        double[] numerosReales = new double[3];
        int[] numerosEnteros = new int[6];
        boolean[] booleanos =new boolean[10];
        char[] letras = new char[5];
        String[] frases = new  String[20];
        LocalDate[] fecha = new LocalDate[3];

        int datos[] = {2, -3, 0, 7};
        
        String[] palabrasReservadas = {"null", "true", "false"};

        numerosReales[0] = 1.27;
        numerosReales[1] = 0.3;
        numerosReales[2] = 9.0;

        numerosEnteros[0] = 5;
        numerosEnteros[1] = -1;

        frases[0] = "En un lugar de la Mancha...";

        System.out.println(numerosReales[1] + " - " + numerosEnteros[0]);
    }
}
