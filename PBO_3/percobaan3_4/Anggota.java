public class Anggota { 
    private String nama; 
    private String alamat;
    private float simpanan;

    Anggota (String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
        this.simpanan = 0;
    }

    public void setNama(String name){
        this.nama = name;
    }

    public void setAlamat(String Alamat){
        this.alamat = Alamat;
    }

    public String getNama(){
        return nama;
    }

    public String getAlamat(){
        return alamat;
    }

    public float getSimpanan(){
        return simpanan;
    }

    public void setor (float uang){
        simpanan += uang;
    }

    public void pinjam(float uang){
        simpanan -= uang;
    }

}