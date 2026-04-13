package tugas_06April2026;

public class BangunDatar {
    private int panjang;
    private int lebar;

    // Constructor
    public BangunDatar(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    // Getter
    public int getPanjang() {
        return panjang;
    }

    public int getLebar() {
        return lebar;
    }

    // Setter
    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    // Method hitung luas
    public int hitungLuas() {
        return panjang * lebar;
    }
}

