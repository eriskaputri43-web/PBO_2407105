package tugas_06April2026;

public class Main {
    public static void main(String[] args) {

        double panjang = 10;
        double lebar = 5;
        double tinggi = 4;

        BangunDatar bd = new BangunDatar(panjang, lebar);
        BangunRuang br = new BangunRuang(panjang, lebar, tinggi);

        System.out.println("Luas Alas : " + bd.hitungLuas());
        System.out.println("Volume dari class parent   : " + br.hitungVolume());
        System.out.println("Volume dari class child   : " + br.hitungVolume2());
    }
}