import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by merike on 22.03.2017.
 */
public class TestJõed {
    public static void main(String[] args) throws IOException {
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

        System.out.println("Ammooniumlämmastik: ");
        for (Double o : NH4) {
            System.out.println(o);
        }
        System.out.println("Biokeemiline hapnikutarve: ");
        for (Double o : BHT5) {
            System.out.println(o);
        }
        System.out.println("Lahustusnud hapnik: ");
        for (Double o : O2) {
            System.out.println(o);
        }
        System.out.println("Üldfosfor: ");
        for (Double o : Püld) {
            System.out.println(o);
        }
        System.out.println("Üldlämmastik: ");
        for (Double o : Nüld) {
            System.out.println(o);
        }

    }
}

