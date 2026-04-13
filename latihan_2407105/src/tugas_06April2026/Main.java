package tugas_06April2026;

public class Main {
    public static void main(String[] args) {

        int panjang = 10;
        int lebar = 5;
        int tinggi = 4;

        BangunDatar bd = new BangunDatar(panjang, lebar);
        BangunRuang br = new BangunRuang(panjang, lebar, tinggi);

        System.out.println("Luas Alas : " + bd.hitungLuas());
        System.out.println("Volume    : " + br.hitungVolume());
    }
}