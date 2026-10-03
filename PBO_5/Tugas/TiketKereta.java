public class TiketKereta extends Tiket {
    protected int nomorGerbong;
    protected String nomorKursi;

    public TiketKereta(){
    }

    public TiketKereta(String kodeTiket, String namaPenumpang, String asal, String tujuan, int hargaDasar, int nomorGerbong, String nomorKursi){
        super(kodeTiket, namaPenumpang, asal, tujuan, hargaDasar);
        this.nomorGerbong = nomorGerbong;
        this.nomorKursi = nomorKursi;
    }

    public void tampilKereta(){
        System.out.println("================= Tiket Kereta =================");
        super.tampilTiket();
        System.out.println("Nomor Gerbong       = " + nomorGerbong);
        System.out.println("Nomor Kursi         = " + nomorKursi);
        System.out.println("Total Bayar         = " + getHargaDasar());
    }
}
