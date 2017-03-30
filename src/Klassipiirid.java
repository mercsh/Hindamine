/**
 * Created by merike on 29.03.2017.
 */
public class Klassipiirid extends Protsentiilid {
    //meetod NH4 seisundipiirid
    public int NH4Klass(double[] list) {
        double NH490 = protsentiil90(list);
        if (NH490 < 0.10) {
            return 5;
        }
        else if (NH490 >= 0.10 && NH490 < 0.30) {
            return 4;
        }
        else if (NH490 >= 0.30 && NH490 < 0.45) {
            return 3;
        }
        else if (NH490 >= 0.45 && NH490 < 0.60) {
            return 2;
        }
        else {
            return 1;
        }

    }

    //meetod BHT5 seisundipiirid
    public int BHT5Klass(double[] list) {
        double BHT5k = aritmkeskmine(list);
        if (BHT5k < 1.8) {
            return 5;
        }
        else if (BHT5k >= 1.8 && BHT5k < 3.0) {
            return 4;
        }
        else if (BHT5k >= 3.0 && BHT5k < 4.0) {
            return 3;
        }
        else if (BHT5k >= 4.0 && BHT5k < 5.0) {
            return 2;
        }
        else {
            return 1;
        }
    }
    //meetod O2 seisundipiirid
    public int O2Klass(double[] list) {
        double O210 = protsentiil10(list);
        if (O210 > 70) {
            return 5;
        }
        else if (O210 <= 70 && O210 > 60) {
            return 4;
        }
        else if (O210 <= 60 && O210 > 50) {
            return 3;
        }
        else if (O210 <= 50 && O210 > 40) {
            return 2;
        }
        else {
            return 1;
        }
    }

    //meetod üldP seisundipiirid
    public int PKlass(double[] list) {
        double Püldk = aritmkeskmine(list);
        if (Püldk < 0.05) {
            return 5;
        }
        else if (Püldk >= 0.05 && Püldk < 0.08) {
            return 4;
        }
        else if (Püldk >= 0.08 && Püldk < 0.1) {
            return 3;
        }
        else if (Püldk >= 0.1 && Püldk < 0.12) {
            return 2;
        }
        else {
            return 1;
        }
    }

    //meetod üldN seisundipiirid
    public int NKlass(double[] list) {
        double Nüldk = aritmkeskmine(list);
        if (Nüldk < 1.5) {
            return 5;
        }
        else if (Nüldk >= 1.5 && Nüldk < 3.0) {
            return 4;
        }
        else if (Nüldk >= 3.0 && Nüldk < 6.0) {
            return 3;
        }
        else if (Nüldk >= 6.0 && Nüldk < 8.0) {
            return 2;
        }
        else {
            return 1;
        }
    }

}
