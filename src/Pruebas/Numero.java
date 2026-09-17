package Pruebas;
import java.util.Random;
import java.util.Scanner;

/** @author Flecha */

public class Numero {
    public static void main(String[] args) {

        //créditos del programa
        System.out.println("=================================");
        System.out.println("||  Adivina el número 1 - 100  ||");
        System.out.println("||                             ||");
        System.out.println("||      Tienes 5 intentos      ||");
        System.out.println("||                             ||");
        System.out.println("||         GOOD LUCK!!         ||");
        System.out.println("=================================");
        System.out.println("");

        Random rnd = new Random();
        int intentos = 1;
        int numSec = rnd.nextInt(0, 101);

        Scanner sc = new Scanner(System.in);

        //lectura anticipada del número del usuario
        System.out.println("==================");
        System.out.println("Intento " + intentos);
        int usrNum = sc.nextInt();

        int wins = 0;
        int loses = 0;
        String seguir;
        boolean continuarPartida = true;

        //contenedor principal del juego
        do {

            //verificación de inicio de partida
            if (usrNum <= 100 && usrNum >= 1) {

                //algoritmo principal de juego
                for (int i = intentos; i < 5; i++) {

                    if (usrNum == numSec) {
                        System.out.println("You WIN!!");
                        wins++;
                        break;
                    } else {
                        if (usrNum < numSec) {
                            System.out.println("Más alto");
                            System.out.println("==================");
                            System.out.println("");
                            intentos++;
                            System.out.println("Intento " + intentos);
                            usrNum = sc.nextInt();
                        } else {
                            System.out.println("Más bajo");
                            System.out.println("==================");
                            System.out.println("");
                            intentos++;
                            System.out.println("Intento " + intentos);
                            usrNum = sc.nextInt();
                        }
                    }

                    if (intentos == 5 && usrNum != numSec) {
                        System.out.println("=========================================");
                        System.out.println("Perdiste, el número secreto era: " + numSec);
                        loses++;
                    } else if (intentos == 5 && usrNum == numSec) {
                        System.out.println("==================");
                        System.out.println("YOU WIN!!");
                        wins++;
                    }

                }

            } else {
                System.out.println("Número fuera de rango!");
            }

            //pregunta para decidir si seguir en el bucle o salir
            System.out.println("");
            System.out.print("Quieres continuar jugando s/n: ");
            seguir = sc.next();
            System.out.println("");

            //algoritmo de comprobación de la respuesta anterior
            if (seguir.equals("s")) {
                continuarPartida = true;
            } else if (seguir.equals("n")) {
                continuarPartida = false;
                System.out.println("");
                System.out.println("========================");
                System.out.println("||  Wins: " + wins + " Loses: " + loses  + "  ||");
                System.out.println("========================");
                break;
            } else {
                System.out.println("Opción no válida");
                break;
            }

            //algoritmo de reseteo del juego
            intentos = 1;
            numSec = rnd.nextInt(0, 101);

            System.out.println("==================");
            System.out.println("Intento " + intentos);
            usrNum = sc.nextInt();

        } while (continuarPartida == true);

        sc.close();
    }

}
