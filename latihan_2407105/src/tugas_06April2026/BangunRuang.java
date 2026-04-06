package tugas_06April2026;

class BangunRuang extends BangunDatar {
    private int tinggi;

    // Constructor
    public BangunRuang(int panjang, int lebar, int tinggi) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }

    // Getter
    public int getTinggi() {
        return tinggi;
    }

    // Setter
    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    // Method hitung volume
    public int hitungVolume() {
        return getPanjang() * getLebar() * tinggi;
    }
}
