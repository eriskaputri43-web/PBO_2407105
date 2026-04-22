package tugas_13April2026;

public class Main {
    public static void main(String[] args) {

        BangunDatar bd;

        bd = new BangunDatar(3, 4);
        bd.tampilkan();

       
        bd = new Persegi(5);
        bd.tampilkan();

       
        bd = new PersegiPanjang(10, 4);
        bd.tampilkan();

    
        bd = new Segitiga(6, 8);
        bd.tampilkan();
    }
}