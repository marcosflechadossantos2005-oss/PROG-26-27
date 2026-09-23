package ud1;

/**@author Flecha */

public class EjemploCompra2 {
    public static void main(String[] args) {
        final double IVA = 0.21;
        double precioProducto = 20;
        double cantidadProducto = 15;
        double importeTotal = precioProducto * cantidadProducto;
        double importeIva = importeTotal * IVA;
        double importeConIva = importeTotal + importeIva;
        System.out.println("Importe total (sin IVA): " + importeTotal + " euros");
        System.out.println("IVA: " + IVA * 100 + "%");
        System.out.println("Importe del IVA: " + importeIva + " euros");
        System.out.println("Importe total a pagar (con IVA): " + importeConIva + " euros.");
    }

}
