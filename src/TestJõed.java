import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by merike on 22.03.2017.
 */
public class TestJõed {
    public static void main(String[] args) throws IOException {
        // andmete lugemine failist massiividesse
        Scanner s = new Scanner(new File("C:/Users/merike/IdeaProjects/Ryhmatöö/kavastu2.txt"));
        int rank = 0;
        double[] NH4 = new double[12];
        double[] BHT5 = new double[12];
        double[] O2 = new double[12];
        double[] Püld = new double[12];
        double[] Nüld = new double[12];

        while (s.hasNext()) {
            if (s.hasNextDouble()) NH4[rank] = s.nextDouble();
            if (s.hasNextDouble()) BHT5[rank] = s.nextDouble();
            if (s.hasNextDouble()) O2[rank] = s.nextDouble();
            if (s.hasNextDouble()) Püld[rank] = s.nextDouble();
            if (s.hasNextDouble()) Nüld[rank] = s.nextDouble();
            rank++;
        }

        // Väljastab saadud andmed massiivide / näitajate kaupa
        System.out.println("Emajõe Kavastu 2016. aasta hüdrokeemilise seire analüüsitulemused: ");
        System.out.println("Ammooniumlämmastik: ");
        for (Double o : NH4) {
            System.out.print(o + "  ");
        }
        System.out.println();
        System.out.println("Biokeemiline hapnikutarve: ");
        for (Double o : BHT5) {
            System.out.print(o + "  ");
        }
        System.out.println();
        System.out.println("Lahustusnud hapnik: ");
        for (Double o : O2) {
            System.out.print(o + "  ");
        }
        System.out.println();
        System.out.println("Üldfosfor: ");
        for (Double o : Püld) {
            System.out.print(o + "  ");
        }
        System.out.println();
        System.out.println("Üldlämmastik: ");
        for (Double o : Nüld) {
            System.out.print(o + "  ");
        }
        System.out.println();

        // Näitajate keskmised ja standardhälbed
        System.out.println("Kvaliteedinäitajate aasta keskmised, standardhälbed ja protsentiilid (O2 ja NH4 korral): ");
        Keskmine N4keskmine = new Keskmine();
        Standhälve NH4st = new Standhälve();
        Protsentiilid NH490 = new Protsentiilid();
        Keskmine BHT5keskmine = new Keskmine();
        Standhälve BHT5st = new Standhälve();
        Keskmine O2keskmine = new Keskmine();
        Standhälve O2st = new Standhälve();
        Protsentiilid O210 = new Protsentiilid();
        Keskmine Püldkeskmine = new Keskmine();
        Standhälve Püldst = new Standhälve();
        Keskmine Nüldkeskmine = new Keskmine();
        Standhälve Nüldst = new Standhälve();
        System.out.println("Ammooniumlämmastiku keskmine: " + String.format("%.3f", N4keskmine.aritmkeskmine(NH4)) + ", standardhälve: " + String.format("%.3f", NH4st.sthälve(NH4)) +
        " ja 90% tagatusega väärtus: " + String.format("%.3f", NH490.protsentiil90(NH4)));
        System.out.println("Biokeemilise hapnikutarbe keskmine: " + String.format("%.2f", BHT5keskmine.aritmkeskmine(BHT5)) + " ja standardhälve: " + String.format("%.2f", BHT5st.sthälve(BHT5)));
        System.out.println("Lahustunud hapniku keskmine " + String.format("%.1f", O2keskmine.aritmkeskmine(O2)) + ", standardhälve: " + String.format("%.1f", O2st.sthälve(O2)) +
         " ja 10% tagatusega väärtus: " + String.format("%.1f", O210.protsentiil10(O2)));
        System.out.println("Üldfosfori keskmine: " + String.format("%.3f", Püldkeskmine.aritmkeskmine(Püld))+ " ja standardhälve: " + String.format("%.3f", Püldst.sthälve(Püld)));
        System.out.println("Üldlämmastiku keskmine: " + String.format("%.2f", Nüldkeskmine.aritmkeskmine(Nüld)) + " ja standardhälve: " + String.format("%.2f", Nüldst.sthälve(Nüld)));

        // Klassipiirid igale näitajale eraldi
        Klassipiirid NH4le = new Klassipiirid();
        Klassipiirid BHT5le = new Klassipiirid();
        Klassipiirid O2le = new Klassipiirid();
        Klassipiirid Ple = new Klassipiirid();
        Klassipiirid Nle = new Klassipiirid();

        // Kvaliteedinäitaja hindepunktide summa
        int summa = NH4le.NH4Klass(NH4) + BHT5le.BHT5Klass(BHT5) + O2le.O2Klass(O2) + Ple.PKlass(Püld) + Nle.NKlass(Nüld);
        System.out.println("Füüsikalis-keemiliste kvaliteedinäitajate hindepunktide summa on: " + summa);
        SeisundiKlass s1 = new SeisundiKlass();
        System.out.println("Hindepunktide summa järgi on jõe füüsikalis-keemiliste üldtingimuste koondmäärang: ");
        s1.seisund(summa);
    }
}

