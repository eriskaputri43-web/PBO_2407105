package tugas_13April2026;

public class Main {
    public static void main(String[] args) {

        BangunDatar bd;

        // BangunDatar
        bd = new BangunDatar(3, 4);
        bd.tampilkan();

        // Persegi
        bd = new Persegi(5);
        bd.tampilkan();

        // Persegi Panjang
        bd = new PersegiPanjang(10, 4);
        bd.tampilkan();

        // Segitiga
        bd = new Segitiga(6, 8);
        bd.tampilkan();
    }
}