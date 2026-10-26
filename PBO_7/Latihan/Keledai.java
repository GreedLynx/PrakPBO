public class Keledai extends Binatang implements IHerbivora{
    private String suara;
    private String warnaBulu;

    public Keledai (String nama, int jmlKaki, String suara, String warnaBulu){
        super(nama, jmlKaki);
        this.suara = suara;
        this.warnaBulu = warnaBulu;
    }

    @Override
    public void displayMakan(){
        System.out.println("Jenis: Herbivora");
        System.out.println("Jenis: Tumbuhan");
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
