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

    static void crearViaje(Scanner sc) {

        System.out.println("\nCREAR VIAJE");
        System.out.println("==================\n");
    }

    static String fechaViajePublicar(Scanner sc, String fechaViajePublicar) {
        System.out.print("Fecha (dd/mm/aa): ");
        fechaViajePublicar = sc.next();
        return fechaViajePublicar;
    }

    static String horaViajePublicar(Scanner sc, String horaViajePublicar) {
        System.out.print("Hora (00:00): ");
        horaViajePublicar = sc.next();
        return horaViajePublicar;
    }

    static String origenViajePublicar(Scanner sc, String origenViajePublicar) {
        System.out.print("Origen: ");
        origenViajePublicar = sc.next();
        return origenViajePublicar;
    }

    static String destinoViajePublicar(Scanner sc, String destinoViajePublicar) {
        System.out.print("Destino: ");
        destinoViajePublicar = sc.next();
        return destinoViajePublicar;
    }

    static int maxPasajeros(Scanner sc, int maxPasajeros) {
        System.out.print("Cantidad Máxima Pasajeros: ");
        maxPasajeros = sc.nextInt();
        return maxPasajeros;
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

    static void buscarViajesDisponibles() {
        System.out.println("\nSOLICITAR VIAJE");
        System.out.println("==================\n");
    }

    static String fechaViajeSolicitar(Scanner sc) {
        System.out.print("Fecha (dd/mm/aa):");
        String fechaViajeSolicitar = sc.next();
        return fechaViajeSolicitar;
    }

    static String origenViajeSolicitar(Scanner sc) {
        System.out.print("Origen: ");
        String origenViajeSolicitar = sc.next();
        return origenViajeSolicitar;
    }

    static String destinoViajeSolicitar(Scanner sc) {
        System.out.print("Destino: ");
        String destinoViajeSolicitar = sc.next();
        return destinoViajeSolicitar;
    }

    static int pasajeros(Scanner sc) {
        System.out.print("Pasajeros: ");
        int pasajeros = sc.nextInt();
        return pasajeros;
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
        } else {
            System.out.println("Reserva cancelada.");
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
                    fechaViajePublicar(sc, fechaViajePublicar);
                    horaViajePublicar(sc, horaViajePublicar);
                    origenViajePublicar(sc, origenViajePublicar);
                    destinoViajePublicar(sc, destinoViajePublicar);
                    maxPasajeros(sc, maxPasajeros);
                    confirmarPublicacion(sc, confirmarViaje);
                    break;
                case 2:
                    buscarViajesDisponibles();
                    fechaViajeSolicitar(sc);
                    origenViajeSolicitar(sc);
                    destinoViajeSolicitar(sc);
                    pasajeros(sc);
                    if (fechaViajePublicar.equals(fechaViajeSolicitar)
                            && destinoViajePublicar.equals(destinoViajeSolicitar)
                            && origenViajePublicar.equals(origenViajeSolicitar)
                            && maxPasajeros >= pasajeros) {
                        viajesDisponibles(fechaViajePublicar, horaViajePublicar, origenViajePublicar,
                                destinoViajePublicar, maxPasajeros, sc);
                    } else {
                        System.out.println("No hay viajes disponibles.");
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
                System.out.println("");
                menu();
                opcion = sc.nextInt();
            } else {
                hacerAlgoMas = false;
            }
        }
        System.out.println("\nGracias por usar nuestra app!");
    }
}
