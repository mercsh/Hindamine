/**
 * Created by merike on 29.03.2017.
 */
public class SeisundiKlass {
    public void seisund(int summa) {
        if (summa < 25 && summa >=23) {
            System.out.println("Väga hea");
        }
        else if (summa <=22 && summa >= 18) {
            System.out.println("Hea");
        }
        else if (summa <=17 && summa >=13) {
            System.out.println("Kesine");
        }
        else if (summa <=12 && summa>=8) {
            System.out.println("Halb");
        }
        else {
            System.out.println("Väga halb");
        }
    }
}
