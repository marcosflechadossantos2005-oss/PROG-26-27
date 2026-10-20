package ud2.ejercicios.funciones;

import java.util.Scanner;

/** @author Flecha */
public class EnquisaCursoEspecializacion {
    public static void mostrarMenu(){
        System.out.println("1. Ciberseguridade");
        System.out.println("2. Videoxogos");
        System.out.println("3. IA");
        System.out.println("4. Nada");
        System.out.println("0. Sair");
    }

    private  static int pedirOpcion() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca opción: ");
        return sc.nextInt();
    }

    public static void main(String[] args) {
        
        mostrarMenu();

        int opcion = pedirOpcion();

        while (opcion != 0) {
            System.out.println("Gracias. Hemos registrado tu respuesta");

            mostrarMenu();

            opcion = pedirOpcion();
        }

        
    }
}
