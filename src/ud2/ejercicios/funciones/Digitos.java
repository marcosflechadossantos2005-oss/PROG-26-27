package ud2.ejercicios.funciones;

public class Digitos {
    public static void main(String[] args) {
        final int DIEZ = 10;
        int num = 1235;

        int dig = numDigitos(num);

        for (int i = 1; i <= dig; i++) {
            //va cogiendo cada dígito de un número
            int unDig = num % (int) Math.powExact(DIEZ, i) / (int) Math.pow(DIEZ, i - 1);
            System.out.println(unDig);
        }
    }

    public static int numDigitos(int n) {
        int dig = 1;
        while (n / Math.powExact(10, dig) > 0) {
            dig++;
        }
        return dig;
    }
}
