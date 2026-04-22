package latihan_pbo.latihan4;

public class MenuItem extends Menu {
    protected int jumlah;

    public MenuItem(String nama, double harga, int jumlah) {
        super(nama, harga);
        this.jumlah = jumlah;
    }

    @Override
    public double HitungTotal() {
        return harga * jumlah;
    }

    @Override
    public void tampilkan() {
        System.out.println("Menu   : " + nama);
        System.out.println("Harga  : " + harga);
        System.out.println("Jumlah : " + jumlah);
        System.out.println("Total  : " + HitungTotal());
    }
}