package tugas_2407105;
import java.util.Scanner;

// Superclass
class BangunDatar {
    protected double luas;
    protected double keliling;

    public double getLuas() {
        return luas;
    }

    public double getKeliling() {
        return keliling;
    }
}

// Persegi
class Persegi extends BangunDatar {
    private double sisi;

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public void hitung() {
        luas = sisi * sisi;
        keliling = 4 * sisi;
    }
}

// Persegi Panjang
class PersegiPanjang extends BangunDatar {
    private double panjang;
    private double lebar;

    public void setData(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public void hitung() {
        luas = panjang * lebar;
        keliling = 2 * (panjang + lebar);
    }
}

// Segitiga
class Segitiga extends BangunDatar {
    private double alas;
    private double tinggi;
    private double sisiMiring;

    public void setData(double alas, double tinggi, double sisiMiring) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisiMiring = sisiMiring;
    }

    public void hitung() {
        luas = 0.5 * alas * tinggi;
        keliling = alas + tinggi + sisiMiring;
    }
}

// Lingkaran
class Lingkaran extends BangunDatar {
    private double jari;

    public void setJari(double jari) {
        this.jari = jari;
    }

    public void hitung() {
        luas = 3.14 * jari * jari;
        keliling = 2 * 3.14 * jari;
    }
}

// Main Class
public class tugas_2407105 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== KALKULATOR BANGUN DATAR ===");
        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Segitiga");
        System.out.println("4. Lingkaran");
        System.out.print("Pilih menu: ");
        int pilihan = input.nextInt();

        if (pilihan == 1) {
            Persegi p = new Persegi();
            System.out.print("Masukkan sisi: ");
            double sisi = input.nextDouble();
            p.setSisi(sisi);
            p.hitung();
            System.out.println("Luas = " + p.getLuas());
            System.out.println("Keliling = " + p.getKeliling());

        } else if (pilihan == 2) {
            PersegiPanjang pp = new PersegiPanjang();
            System.out.print("Masukkan panjang: ");
            double panjang = input.nextDouble();
            System.out.print("Masukkan lebar: ");
            double lebar = input.nextDouble();
            pp.setData(panjang, lebar);
            pp.hitung();
            System.out.println("Luas = " + pp.getLuas());
            System.out.println("Keliling = " + pp.getKeliling());

        } else if (pilihan == 3) {
            Segitiga s = new Segitiga();
            System.out.print("Masukkan alas: ");
            double alas = input.nextDouble();
            System.out.print("Masukkan tinggi: ");
            double tinggi = input.nextDouble();
            System.out.print("Masukkan sisi miring: ");
            double sisiMiring = input.nextDouble();
            s.setData(alas, tinggi, sisiMiring);
            s.hitung();
            System.out.println("Luas = " + s.getLuas());
            System.out.println("Keliling = " + s.getKeliling());

        } else if (pilihan == 4) {
            Lingkaran l = new Lingkaran();
            System.out.print("Masukkan jari-jari: ");
            double jari = input.nextDouble();
            l.setJari(jari);
            l.hitung();
            System.out.println("Luas = " + l.getLuas());
            System.out.println("Keliling = " + l.getKeliling());

        } else {
            System.out.println("Pilihan tidak tersedia!");
        }
    }
}