/**
 * Created by merike on 29.03.2017.
 */
// Klass Protsentiilid, Standardhälbe alamklass, et kasutada keskmist ja standardhälvet
public class Protsentiilid extends Standhälve {
    // meetod 10% tagatusega väärtuse leidmiseks
    static double protsentiil10(double[] list) {
        double keskmine = aritmkeskmine(list);  // leiab keskmise
        double sthälve = sthälve(list); // leiab standardhälbe

        return keskmine - 1.2816 * sthälve;
    }

    // meetod 90% tagatusega väärtuse leidmiseks
    static double protsentiil90(double[] list) {
        double keskmine = aritmkeskmine(list); // leiab keskmise
        double sthälve = sthälve(list); // leiab standardhälbe
        double M = Math.log(keskmine / Math.sqrt(1 + (Math.pow(sthälve, 2))/(Math.pow(keskmine, 2))));
        double S = Math.sqrt(Math.log(1 + (Math.pow(sthälve, 2))/(Math.pow(keskmine, 2))));

        return Math.exp(M + 1.2816 * S);

    }

}
