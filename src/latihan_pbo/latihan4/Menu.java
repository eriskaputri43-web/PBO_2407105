package latihan_pbo.latihan4;

public class Menu {
    protected String nama;
    protected double harga;

    public Menu(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public double HitungTotal() {
        return 0;
    }

    public void tampilkan() {
        System.out.println("Menu: " + nama);
        System.out.println("Harga: " + harga);
        System.out.println("Total: " + HitungTotal());
    }
}