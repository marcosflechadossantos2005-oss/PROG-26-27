package ud2.ejercicios;

import java.util.Scanner;

/** @author Flecha */
public class EstadisticaEdad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la edad de un alumno: ");
        int edad = sc.nextInt();

        int sumaEdades = 0;
        int numAlumnos = 0;
        int mayoresDeEdad = 0;

        while (edad >= 0) {
            sumaEdades += edad;
            numAlumnos++;
            if (edad >= 18) {
                mayoresDeEdad++;
            }
            System.out.print("Introduce la edad de un alumno: ");
            edad = sc.nextInt();
        }
        sc.close();

        int mediaEdades = sumaEdades / numAlumnos;

        System.out.println("");
        System.out.println("================================================");
        System.out.println("La suma de las edades es: " + sumaEdades);
        System.out.println("La cantidad de alumnos es: " + numAlumnos);
        System.out.println("La media de las edades es: " + mediaEdades);
        System.out.println("Hay " + mayoresDeEdad + " mayores e edad.");
    }
}
