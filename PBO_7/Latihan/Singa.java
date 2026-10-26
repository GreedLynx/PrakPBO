public class Singa extends Binatang implements IKarnivora{
    private String suara;
    private String warnaBulu;

    public Singa (String nama, int jmlKaki, String suara, String warnaBulu){
        super(nama, jmlKaki);
        this.suara = suara;
        this.warnaBulu = warnaBulu;
    }

    @Override
    public void displayMakan(){
        System.out.println("Jenis: Karnivora");
        System.out.println("Jenis: Daging");
    }

    
    @Override
    public void displayBinatang(){
        System.out.println("Nama: " + getNama());
        System.out.println("Jumlah Kaki: " + getJmlKaki());
    }

    public void displayData(){
        displayMakan();
        displayBinatang();
        System.out.println("Suara: " + this.suara);
        System.out.println("Warna Bulu: " + this.warnaBulu);
        System.out.println();
    }
}
