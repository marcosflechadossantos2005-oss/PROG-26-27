package ud2.examen.mflecdos;

/** @author mflecdos */
public class DistanciaGPS {
    public static void main(String[] args) {
        double lat1 = 0;
        double lon1 = 0;
        double lat2 = 0;
        double lon2 = 0;
        double distancia = 0;
        final int R = 6371;

        distancia = distancia(lat1, lon1, lat2, lon2, R);

        System.out.println("La distancia en kilómetros es: " + distancia);

    }

    static double distancia(double lat1, double lon1, double lat2, double lon2, final int R) {
        double distanciaKilometros = 0;
        Math.toRadians(lat1);
        Math.toRadians(lon1);
        Math.toRadians(lat2);
        Math.toRadians(lon2);

        double diferenciaLatitudes = lat1 - lat2;
        double diferenciaLongitudes = lon1 - lon2;

        double a = Math.pow(Math.sin(diferenciaLatitudes / 2), 2) + Math.cos(lat1) * Math.cos(lat2) * Math.pow(Math.sin(diferenciaLongitudes / 2), 2);
        double c = 2 * Math.atan(2 * Math.sqrt(a) + 2 * Math.sqrt(1 - a));
        distanciaKilometros = R * c;

        return distanciaKilometros;
    }
}
