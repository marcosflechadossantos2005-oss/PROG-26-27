package ud2.examen.mflecdos;

import java.util.Scanner;

/** @author mflecdos */
public class TirosLibres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int MAXTIROS = 20;
        int tirosRealizados = 0;
        int tirosAcertados = 0;
        int fallosConsecutivos = 1;

        System.out.print("Introduzca tiros realizados, 1 (acierto), 0 (fallo): ");
        int tiro = sc.nextInt();
        tirosRealizados++;

        boolean seguir = true;

        while (seguir == true) {
            if (tiro == 1) {
                tirosRealizados++;
                tirosAcertados++;
                fallosConsecutivos = 1;
            } else if (tiro == 0) {
                tirosRealizados++;
                fallosConsecutivos++;
            }
            if (fallosConsecutivos >= 3) {
                seguir = false;
            } else if (tirosRealizados >= 20) {
                seguir = false;
            }
            System.out.print("Siguiente tiro: ");
            tiro = sc.nextInt();
        }
        sc.close();

        double porcentajeAcierto = (tirosAcertados * 100) / tirosRealizados;

        System.out.println("Stadísticas: ");
        System.out.println("=============================\n");
        System.out.println("Tiros Realizados: " + tirosRealizados);
        System.out.println("Tiros Acertados: " + tirosAcertados);
        System.out.println("Porcentaje de acierto: " + String.format("%.2f", porcentajeAcierto));
        if (porcentajeAcierto > 70.00) {
            System.out.println("SI supera el 70%");
        } else {
            System.out.println("NO supera el 70%");
        }
    }
}
