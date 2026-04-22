package latihan_pbo.latihan3;

public class Main {
    public static void main(String[] args) {

        // Persegi
        Persegi p = new Persegi();
        p.setSisi(5);
        System.out.println("Persegi");
        System.out.println("Luas = " + p.hitungLuas());
        System.out.println("Keliling = " + p.hitungKeliling());
        System.out.println();

        // Persegi Panjang
        PersegiPanjang pp = new PersegiPanjang();
        pp.setPanjang(10);
        pp.setLebar(4);
        System.out.println("Persegi Panjang");
        System.out.println("Luas = " + pp.hitungLuas());
        System.out.println("Keliling = " + pp.hitungKeliling());
        System.out.println();

        // Segitiga
        Segitiga s = new Segitiga();
        s.setAlas(6);
        s.setTinggi(4);
        System.out.println("Segitiga");
        System.out.println("Luas = " + s.hitungLuas());
        System.out.println("Keliling = " + s.hitungKeliling());
        System.out.println();

        // Lingkaran
        Lingkaran l = new Lingkaran();
        l.setJari(7);
        System.out.println("Lingkaran");
        System.out.println("Luas = " + l.hitungLuas());
        System.out.println("Keliling = " + l.hitungKeliling());

    }
}