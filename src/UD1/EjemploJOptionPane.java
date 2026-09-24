package ud1;

import javax.swing.JOptionPane;

/** @author Flecha */

public class EjemploJOptionPane {
    public static void main(String[] args) {
        System.out.println(JOptionPane.showConfirmDialog(null, "Estás de acuerdo?"));

        String nombre = "";
        nombre = JOptionPane.showInputDialog("Escribe tu nombre");
        String msg = "Hola" + nombre + "!";
        JOptionPane.showMessageDialog(null, msg);

        String entradaUsr = JOptionPane.showInputDialog("Escribe un número ");
        int numero = Integer.parseInt(entradaUsr);
        double cuadrado = Math.pow(numero, 2);
        msg = "El cuadrado de " + numero + "es igual a " + cuadrado;
        JOptionPane.showMessageDialog(null, msg);
    }
}
