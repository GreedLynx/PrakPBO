public class Tas{
    private int jumlahKompartemen, kapasitasLiter;

    public Tas(int jumlahKompartemen, int kapasitasLiter){
        this.jumlahKompartemen = jumlahKompartemen;
        this.kapasitasLiter = kapasitasLiter;
    }

    public int setJmlKompartemen(int kompartemen){
        return jumlahKompartemen = kompartemen;
    }

    public int setKapasitasLiter (int kapasitas){
        return kapasitasLiter = kapasitas;
    }

    public void cetakInfoTas(){
        System.out.println("Jumlah Kompartemen tas : " + jumlahKompartemen);
        System.out.println("Kapasitas Tas dalam liter : " + kapasitasLiter);
    }
}