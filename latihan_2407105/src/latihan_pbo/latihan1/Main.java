package latihan_pbo.latihan1;

class Cafe {
    String nama;
    String alamat;

    // constructor
    Cafe(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;

        System.out.println("nama cafeenya adalah : " + nama);
        System.out.println("alamatnya di : " + alamat);
        System.out.println("==========================");
    }

    // methode
    void buka(){
        System.out.println("==========================");
        System.out.println("Cafe Sudah Buka");
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}

public class Main {
    public static void main(String[] args) {

        System.out.println("==========================");

        Cafe cafe1 = new Cafe("Kopi", "Indramayu");
        Cafe cafe2 = new Cafe("Kopi Kenangan", "Indramayu");
        Cafe cafe3 = new Cafe("Tomoro", "Indramayu");
        Cafe cafe4 = new Cafe("Koji", "Jatibarang");
        cafe3.buka();
        cafe3.setNama("Kopiku");

    }
}
