public class Dokter {
    private String nip;
    private String nama;
    private String spesialis;

    public Dokter(String nip, String nama, String spesialis) {
        this.nip = nip;
        this.nama = nama;
        this.spesialis = spesialis;
    }

    public String getInfo() {
        return "dr. " + nama + " (" + spesialis + ") - NIP: " + nip;
    }
}