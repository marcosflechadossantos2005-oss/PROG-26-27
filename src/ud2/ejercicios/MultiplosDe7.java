package ud2.ejercicios;

/** @author Flecha */
public class MultiplosDe7 {
    public static void main(String[] args) {
        
        final int MULTIPLOS_DE = 7;
        final int LIMITE = 100;

        for (int i = 0; i <= LIMITE; i++) {
            if (i % MULTIPLOS_DE == 0) {
                System.out.println("El número " + i + " es múltiplo de 7");
            }
        }
        
    }
}
