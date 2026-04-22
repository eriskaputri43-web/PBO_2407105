package tugas_06April2026;

class BangunRuang extends BangunDatar {
    private double tinggi;

    public BangunRuang(double panjang, double lebar, double tinggi) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    
    @Override
    public double hitungVolume() {
        return getPanjang() * getLebar() * tinggi;
    }


    public double hitungVolume2() {
        return getPanjang() * getLebar() * tinggi;
    }
}