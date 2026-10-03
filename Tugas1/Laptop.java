public class Laptop {
    String brand;
    int ram;
    int ssd;
    boolean isNyala;

    public Laptop (String brand, int RAM, int SSD){ 
        this.brand = brand;
        this.ram = RAM;
        this.ssd = SSD;
        this.isNyala = false;
    }

    public void nyalakan() { 
        this.isNyala = true;
        System.out.println("Perangkat menyala!");
    }

    public void matikan() {
        this.isNyala = false;
        System.out.println("Perangkat mati!");
    }

    public void setBrand(String brandName){
        this.brand = brandName;
    }

    public void setRAM(int Ram){
        this.ram = Ram;
    }

    public void setSSD(int SSD){
        this.ssd = SSD;
    }

    public String getBrand(){
        return brand;
    }

    public int getRAM(){
        return ram;
    }

    public int getSSD(){
        return ssd;
    }

    public void cetakInfo() {
        System.out.println("Brand : " + brand);
        System.out.println("RAM : " + ram + "GB");
        System.out.println("SSD : " + ssd + "GB");
        System.out.println("Status : " + (isNyala ? "Aktif" : "Mati"));
    }
}
