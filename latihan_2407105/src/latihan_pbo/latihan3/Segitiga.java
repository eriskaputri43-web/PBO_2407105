package latihan_pbo.latihan3;

public class Segitiga extends BangunDatar {

    public double hitungLuas() {
        return 0.5 * getAlas() * getTinggi();
    }

    public double hitungKeliling() {
        double sisiMiring = Math.sqrt((getAlas() * getAlas()) + (getTinggi() * getTinggi()));
        return getAlas() + getTinggi() + sisiMiring;
    }
}