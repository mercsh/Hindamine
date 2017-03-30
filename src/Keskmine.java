/**
 * Created by merike on 29.03.2017.
 */
// Klass Keskmine, leiab näitaja aritmeetilise keskmise
public class Keskmine {
    //meetod keskmise leidmiseks
    static double aritmkeskmine(double[] list) {
        double summa = 0;
        for (int i = 0; i < list.length; i++) {
            summa += list[i];
        }
        return summa / list.length;
    }
}
