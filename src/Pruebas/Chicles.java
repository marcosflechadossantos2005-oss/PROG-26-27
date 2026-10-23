package Pruebas;

/** @author Flecha */
public class Chicles {
    public static void main(String[] args) {
        int chiclesComprados = 0;
        int oferta = 0;

        System.out.println(totalChicles(25, 5)); // 31
        System.out.println(totalChicles(5, 5)); // 6
        System.out.println(totalChicles(100, 10)); // 111
        System.out.println(totalChicles(100, 0)); // 100
        System.out.println(totalChicles(20, 2)); // -1
        System.out.println(totalChicles(10, -1)); // -1
    }

    static int totalChicles(int chiclesComprados, int oferta) {
        int chiclesRegalo = 0;
        int totalChicles = 0;

        if (chiclesComprados < 0 || oferta < 0 || chiclesRegalo < 0) {
            return -1;
        } else if (oferta == 0) {
            totalChicles = chiclesComprados;
        } else {
            chiclesRegalo = chiclesComprados / oferta;
            if (chiclesRegalo > oferta) {
                return -1;
            } else {
                while (chiclesRegalo >= oferta) {
                    chiclesComprados += chiclesRegalo;
                    chiclesRegalo = chiclesRegalo - oferta;
                    chiclesComprados++;
                }
                totalChicles = chiclesComprados + chiclesRegalo;
            }
        }

        return totalChicles;
    }
}
