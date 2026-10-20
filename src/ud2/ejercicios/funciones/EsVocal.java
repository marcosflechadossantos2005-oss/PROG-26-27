package ud2.ejercicios.funciones;

/** @author Flecha */
public class EsVocal {
    public static boolean esVocal(String caracter) {
        switch (caracter) {
            case "a", "e", "i", "o", "u", "A", "E", "I", "O", "U", "á", "é", "í", "ó", "ú", "Á", "É", "Í", "Ó", "Ú":
                return true;
            default:
                return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(esVocal("A")); // true
        System.out.println(esVocal("e")); // true
        System.out.println(esVocal("n")); // false
        System.out.println(esVocal("H")); // false
        System.out.println(esVocal("í")); // true
        System.out.println(esVocal("Ó")); // true
    }
}
