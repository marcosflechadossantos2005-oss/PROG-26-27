package ud2.ejercicios.funciones;

/** @author Flecha */
public class Capicua {
    public static boolean esCapicua(long n) {
        long dig1 = n;
        long dig2 = n;
        long dig3 = n;
        long dig4 = n;

        if (n < 10) {
            return false;
        } else if (n >= 10 && n <= 99) {
            dig1 /= 10;
            dig2 %= 10;
            if (dig1 == dig2) {
                return true;
            } else {
                return false;
            }
        } else if (n >= 100 && n <= 999) {
            dig1 /= 100;
            dig2 %= 10;
            if (dig1 == dig2) {
                return true;
            } else {
                return false;
            }
        } else {
            dig1 /= 1000;
            dig2 %= 10;
            dig3 /= 100;
            dig4 %= 100;
            if (dig1 == dig2 && dig3 == dig4) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static void main(String[] args) {

    }
}
