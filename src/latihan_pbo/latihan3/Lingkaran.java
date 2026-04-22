package latihan_pbo.latihan3;

public class Lingkaran extends BangunDatar {

    public double hitungLuas() {
        return 3.14 * getJari() * getJari();
    }

    public double hitungKeliling() {
        return 2 * 3.14 * getJari();
    }
}