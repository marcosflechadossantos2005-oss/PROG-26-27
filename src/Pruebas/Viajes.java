package Pruebas;

import java.util.Scanner;

/** @author Flecha */
public class Viajes {
    static boolean comprobarCredenciales(String nombre, String contra, String NOMBRE, String CONTRA) {
        boolean credencialesCorrectos = false;

        if (nombre.equals(NOMBRE) && contra.equals(CONTRA)) {
            credencialesCorrectos = true;
        } else {
            credencialesCorrectos = false;
        }

        return credencialesCorrectos;
    }

    static void menu() {
        System.out.println("Seleccione una opción (1,2,3): ");
        System.out.println("1.- Crear viaje.");
        System.out.println("2.- Apuntarse a un viaje.");
        System.out.println("3.- Cancelar.\n");
    }

    static String fechaViajePublicar(Scanner sc) {
        System.out.print("Fecha (dd/mm/aa): ");
        String fechaViajePublicar = sc.next();
        return fechaViajePublicar;
    }
    static String horaViajePublicar(Scanner sc) {
        System.out.print("Hora (00:00): ");
        String horaViajePublicar = sc.next();
        return horaViajePublicar;
    }
    static String origenViajePublicar(Scanner sc) {
        System.out.print("Origen: ");
        String origenViajePublicar = sc.next();
        return origenViajePublicar;
    }
    static String destinoViajePublicar(Scanner sc) {
        System.out.print("Destino: ");
        String destinoViajePublicar = sc.next();
        return destinoViajePublicar;
    }
    static int maxPasajeros(Scanner sc) {
        System.out.print("Cantidad Máxima Pasajeros: ");
        int maxPasajeros = sc.nextInt();
        return maxPasajeros;
    }

    static void crearViaje(Scanner sc) {

        System.out.println("\nCREAR VIAJE");
        System.out.println("==================\n");
    }

    static void confirmarPublicacion(Scanner sc, String confirmarViaje) {
        System.out.print("Publicar Viaje (s/n): ");
        confirmarViaje = sc.next();
        confirmarViaje.toLowerCase();
        if (confirmarViaje.equals("s")) {
            System.out.println("Viaje publicado con éxito!");
        } else if (confirmarViaje.equals("n")) {
            System.out.println("Viaje cancelado.");
        } else {
            System.out.println("Opción no válida.");
        }
    }

    static void buscarViajesDisponibles(Scanner sc, String fechaViajeSolicitar, String origenViajeSolicitar,
            String destinoViajeSolicitar, int pasajeros) {

        System.out.println("\nSOLICITAR VIAJE");
        System.out.println("==================\n");
        System.out.print("Fecha (dd/mm/aa):");
        fechaViajeSolicitar = sc.next();
        System.out.print("Origen: ");
        origenViajeSolicitar = sc.next();
        System.out.print("Destino: ");
        destinoViajeSolicitar = sc.next();
        System.out.print("Pasajeros: ");
        pasajeros = sc.nextInt();
    }

    public static void viajesDisponibles(String fechaViajePublicar, String horaViajePublicar,
            String origenViajePublicar,
            String destinoViajePublicar, int maxPasajeros, Scanner sc) {

        System.out.println("Hay viajes en esa fecha: ");
        System.out.println("===============================================");
        System.out.println("|| - Fecha: " + fechaViajePublicar);
        System.out.println("|| - Hora: " + horaViajePublicar);
        System.out.println("|| - Origen: " + origenViajePublicar);
        System.out.println("|| - Destino: " + destinoViajePublicar);
        System.out.println("|| - Max. Pasajeros: " + maxPasajeros);
        System.out.println("===============================================");
        System.out.println("Desea apuntarse (s/n): ");
        String apuntarse = sc.next();
        apuntarse.toLowerCase();
        if (apuntarse.equals("s")) {
            System.out.print("Viaje reservado con éxito!\n");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final String NOMBRE = "Marcos";
        final String CONTRA = "Flecha";
        String fechaViajeSolicitar = "", origenViajeSolicitar = "", destinoViajeSolicitar = "";
        String fechaViajePublicar = "", horaViajePublicar = "", origenViajePublicar = "",
                destinoViajePublicar = "", confirmarViaje = "";
        int pasajeros = 0, maxPasajeros = 0;

        System.out.println("Introduzca nombre y contraseña: ");
        String nombre = sc.next();
        String contra = sc.next();
        comprobarCredenciales(NOMBRE, CONTRA, nombre, contra);

        while (comprobarCredenciales(NOMBRE, CONTRA, nombre, contra) == false) {
            System.out.println("Nombre o contraseña incorrectos");
            System.out.println("Introduzca de nuevo las credenciales: ");
            nombre = sc.next();
            contra = sc.next();
            System.out.println("");
            comprobarCredenciales(NOMBRE, CONTRA, nombre, contra);
        }
        System.out.println("Sesión iniciada con éxito!\n");

        menu();
        int opcion = sc.nextInt();

        while (opcion > 3 || opcion < 1) {
            System.out.println("Opción no válida, seleccione otra!\n");
            menu();
            opcion = sc.nextInt();
        }

        boolean hacerAlgoMas = true;
        String seguir;
        while (hacerAlgoMas == true) {
            switch (opcion) {
                case 1:
                    crearViaje(sc);
                    fechaViajePublicar(sc);
                    horaViajePublicar(sc);
                    origenViajePublicar(sc);
                    destinoViajePublicar(sc);
                    maxPasajeros(sc);
                    confirmarPublicacion(sc, confirmarViaje);
                    break;
                case 2:
                    buscarViajesDisponibles(sc, fechaViajeSolicitar, origenViajeSolicitar, destinoViajeSolicitar,
                            pasajeros);
                    if (fechaViajePublicar.equals(fechaViajeSolicitar)
                            && destinoViajePublicar.equals(destinoViajeSolicitar)
                            && maxPasajeros >= pasajeros) {
                                viajesDisponibles(fechaViajePublicar, horaViajePublicar, origenViajePublicar, destinoViajePublicar, maxPasajeros, sc);
                    } else {
                        System.out.println("No hay viajes disponibles en esa fecha.");
                    }
                    break;
                case 3:
                    System.out.println("Gracias por usar nuestra app!");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
            System.out.println("\nDesea hacer algo más (s/n): ");
            seguir = sc.next();
            seguir.toLowerCase();
            if (seguir.equals("s")) {
                hacerAlgoMas = true;
            } else {
                hacerAlgoMas = false;
            }
            System.out.println("");
            menu();
            opcion = sc.nextInt();
        }
        System.out.println("\nGracias por usar nuestra app!");
    }
}
