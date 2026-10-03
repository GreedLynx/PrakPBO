public class Main {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("Lenovo", 16,512);
        LaptopBisnis laptopBisnis1 = new LaptopBisnis("Lenovo", 32, 1024, 1.8);
        LaptopGaming laptopGaming1 = new LaptopGaming("Lenovo", 32, 2048, "Geforce RTZ 9090");
        Topi topi1 = new Topi("Hitam", 5);
        Tas tas1 = new Tas(4, 4);

        //Super class laptop
        laptop1.nyalakan();
        laptop1.cetakInfo();
        laptop1.matikan();

        //class laptop bisnis
        laptopBisnis1.setBrand("Lenovo Thinkpad");
        laptopBisnis1.setRAM(32);
        laptopBisnis1.setSSD(1024);
        laptopBisnis1.setBerat(1.8);
        laptopBisnis1.kunciSistemKeamanan(true);
        laptopBisnis1.cetakInfo();

        //class laptop gaming
        laptopGaming1.setBrand("Asus ROG Strix");
        laptopGaming1.setRAM(32);
        laptopGaming1.setSSD(1024);
        laptopGaming1.setGpuDedicated("Nvidia Geforce RTX 4060");
        laptopGaming1.aktifkanModeTurbo();
        laptopGaming1.cetakInfo();

        //class Topi
        topi1.setUkuranStrap(4);
        topi1.setWarna("Kuning");
        topi1.cetakInfoTopi();

        //class Tas
        tas1.setJmlKompartemen(2);
        tas1.setKapasitasLiter(10);
        tas1.cetakInfoTas();


    }
}
