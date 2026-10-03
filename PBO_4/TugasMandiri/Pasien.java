public class Pasien {
    private String idPasien;
    private String nama;

    public Pasien(String idPasien, String nama) {
        this.idPasien = idPasien;
        this.nama = nama;
    }

    public String getInfo() {
        return "Pasien [" + idPasien + "] " + nama;
    }
}