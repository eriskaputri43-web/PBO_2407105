package latihan_pbo.latihan4;

public class Main {
    public static void main(String[] args) {

        Menu m1 = new MenuItem("Nasi Goreng", 15000, 2);
        Menu m2 = new MenuItem("Mie Ayam", 12000, 1);
        Menu m3 = new MenuItem("Es Teh", 5000, 3);

        double totalSemua = 0;

        m1.tampilkan();
        totalSemua += m1.HitungTotal();

        m2.tampilkan();
        totalSemua += m2.HitungTotal();

        m3.tampilkan();
        totalSemua += m3.HitungTotal();

        System.out.println("===== TOTAL SEMUA =====");
        System.out.println("Total Bayar: " + totalSemua);
    }
}