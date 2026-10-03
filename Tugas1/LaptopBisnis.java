public class LaptopBisnis extends Laptop {
    private double beratKG;
    private boolean sensorSidikJari;

    public LaptopBisnis (String brand, int ram, int ssd, double beratKG) {
        super(brand, ram, ssd);
        this.beratKG = beratKG;
        this.sensorSidikJari = false;
    }

    public void setBerat(double berat){
        this.beratKG = berat;
    }

    public void kunciSistemKeamanan(boolean keamanan){
        sensorSidikJari = keamanan;
        if (sensorSidikJari){
            System.out.println(getBrand() + " Mengunci sistem dengan otentikasi biometrik");
        } else {
            System.out.println(getBrand() + " Mengunci sistem dengan password standar");
        }
    }

    @Override
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("Berat : " + beratKG + "KG");
        System.out.println("Sensor Biometrik : " + (sensorSidikJari ? "Ada" : "Tidak Ada"));
    }
}