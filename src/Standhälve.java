/**
 * Created by merike on 29.03.2017.
 */
// Klass Standardhälve, klassi Keskmine alamklass, kuna kasutab keskmise leidmise meetodit
public class Standhälve extends Keskmine {
    // meetod standardhälbe leidmiseks
    static double sthälve(double[] list) {
        double keskmine = aritmkeskmine(list);  // leiab keskmise
        double temp = 0;
        for (int i = 0; i < list.length; i++) {
            double val = list[i];
            double ruutVahe = Math.pow(val - keskmine, 2);  // leiab väärtuse ja keskmise vahe ehk hälvete ruudu
            temp += ruutVahe;  // hälvete ruutude summa
        }
        double disp = (double) temp / (double) (list.length - 1); // hälvete ruutude summa / n - 1 ehk dispersioon
        return Math.sqrt(disp); // ruutjuur dispersioonist ehk standardhälve
    }

}
