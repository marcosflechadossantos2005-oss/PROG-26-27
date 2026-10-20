package ud2.ejercicios.funciones;

/** @author Flecha */
public class Maximo {
    static int numeroMaximo(int num1, int num2) {
        int maximo = Math.max(num1, num2);
        return maximo;
    }

    static int numeroMaximo(int num1, int num2, int num3) {
        int maximo = 0;

        if (num1 > num2 && num1 > num3) {
            maximo = num1;
        } else if (num2 > num1 && num2 > num3) {
            maximo = num2;
        } else {
            maximo = num3;
        }

        return maximo;
    }

    static int numeroMaximo(int num1, int num2, int num3, int num4) {
        int maximo = 0;

        if (num1 > num2 && num1 > num3 && num1 > num4) {
            maximo = num1;
        } else if (num2 > num1 && num2 > num3 && num2 > num4) {
            maximo = num2;
        } else if (num3 > num1 && num3 > num2 && num3 > num4) {
            maximo = num3;
        } else {
            maximo = num4;
        }

        return maximo;
    }

    public static void main(String[] args) {
        System.out.println(numeroMaximo(0, 5)); // 5
        System.out.println(numeroMaximo(3, 1)); // 3
        System.out.println(numeroMaximo(5, 9, 1)); // 9
        System.out.println(numeroMaximo(1, 6, 8)); // 8
        System.out.println(numeroMaximo(5, 2, 3)); // 5
        System.out.println(numeroMaximo(5, 1, 0, 8)); // 8
        System.out.println(numeroMaximo(5, 2, 7, 0)); // 7
        System.out.println(numeroMaximo(9, 5, 2, 0)); // 9
        System.out.println(numeroMaximo(0, 8, 2, 4)); // 8
    }
}
