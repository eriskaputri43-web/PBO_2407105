package latihan_pbo.tugas1;
import java.util.Scanner;

class Cafe {
    String nama;
    String bahan1;
    String bahan2;
    String bahan3;

    // Constructor
    Cafe(String nama, String bahan1, String bahan2, String bahan3) {
        this.nama = nama;
        this.bahan1 = bahan1;
        this.bahan2 = bahan2;
        this.bahan3 = bahan3;
    }

    // Method buat minuman (pakai IF ELSE)
    String buatMinuman(int espresso, int susu, double foam) {

        if (espresso == 1 && susu == 2 && foam == 1) {
            return "Moccachino";
        }
        else if (espresso == 1 && susu == 1 && foam == 2) {
            return "Cappuccino";
        }
        else if (espresso == 1 && susu == 2 && foam == 1) {
            return "Latte";
        }
        else {
            return "Menu tidak tersedia";
        }
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Cafe cafe = new Cafe("April Cafe", "Espresso", "Susu", "Foam");

        System.out.print("Masukkan espresso : ");
        int espresso = input.nextInt();

        System.out.print("Masukkan susu : ");
        int susu = input.nextInt();

        System.out.print("Masukkan foam : ");
        double foam = input.nextDouble();

        String hasil = cafe.buatMinuman(espresso, susu, foam);

        System.out.println("Minuman anda : " + hasil);
    }
}