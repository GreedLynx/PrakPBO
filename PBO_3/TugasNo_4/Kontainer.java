public class Kontainer {
    private String nomorResi;
    private String namaPemilik;
    private double kapasitasMaksimal;
    private double beratMuatanSaatIni;

    // Konstruktor
    public Kontainer(String nomorResi, String namaPemilik, double kapasitasMaksimal) {
        this.nomorResi = nomorResi;
        this.namaPemilik = namaPemilik;
        this.kapasitasMaksimal = kapasitasMaksimal;
        this.beratMuatanSaatIni = 0; // Inisialisasi awal 0
    }

    // Getter
    public String getNomorResi() { return nomorResi; }
    public String getNamaPemilik() { return namaPemilik; }
    public double getKapasitasMaksimal() { return kapasitasMaksimal; }
    public double getBeratMuatanSaatIni() { return beratMuatanSaatIni; }

    // Method tambah muatan
    public void tambahMuatan(double berat) {
        if (beratMuatanSaatIni + berat <= kapasitasMaksimal) {
            beratMuatanSaatIni += berat;
        } else {
            System.out.println("Maaf, berat muatan melebihi kapasitas maksimal kontainer.");
        }
    }

    // Method turunkan muatan (versi modifikasi Tugas 5)
    public void turunkanMuatan(double berat) {
        double batasAman = beratMuatanSaatIni * 0.5; // 50% dari muatan saat ini

        if (berat > batasAman) {
            System.out.println("Maaf, demi keselamatan, pembongkaran muatan satu kali jalan tidak boleh melebihi 50% dari muatan saat ini!");
        } else {
            beratMuatanSaatIni -= berat;
        }
    }
}