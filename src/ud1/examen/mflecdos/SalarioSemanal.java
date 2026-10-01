package ud1.examen.mflecdos;

import java.util.Scanner;

/** @author Flecha */
public class SalarioSemanal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el número de horas: ");
        int horas = sc.nextInt();
        sc.close();

        double precioHora = 12.50;
        double precioExtras = precioHora * 2;

        int horasExtra  = (horas > 40) ? horas - 40 : 0;
        
        double salario = (horas <= 40 && horas >= 1) ? horas * precioHora : ((horas - horasExtra) * precioHora) + (horasExtra * precioExtras);

        System.out.println("El salario total es de: " + salario + " euros");
    }
}
