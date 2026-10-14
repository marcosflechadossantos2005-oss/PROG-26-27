package Pruebas;

/** @author Flecha */
public class Colores {
    public static void main(String[] args) {
        final int MAX = 50;

        for (int i = 0; i < MAX; i++) {
            String color = "\033[" + i + "m";
            System.out.println(color + "\\033[" + i + "m");
        }

    }
}
