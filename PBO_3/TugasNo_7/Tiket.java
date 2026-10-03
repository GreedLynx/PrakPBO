public class Tiket {
    private String judulFilm;
    private double hargaDasar;
    private boolean statusPembayaran;

    // Konstruktor
    public Tiket(String judulFilm, double hargaDasar) {
        this.judulFilm = judulFilm;
        
        // Validasi input negatif
        if (hargaDasar < 0) {
            this.hargaDasar = 35000;
        } else {
            this.hargaDasar = hargaDasar;
        }
        
        // Set nilai default
        this.statusPembayaran = false; 
    }

    // Getter (Nilai hanya boleh dibaca)
    public String getJudulFilm() {
        return judulFilm;
    }

    public double getHargaDasar() {
        return hargaDasar;
    }

    // Untuk tipe boolean, getter secara standar menggunakan "is" bukan "get"
    public boolean isStatusPembayaran() {
        return statusPembayaran;
    }

    // Method khusus untuk transaksi
    public void lakukanPembayaran() {
        this.statusPembayaran = true;
    }
}