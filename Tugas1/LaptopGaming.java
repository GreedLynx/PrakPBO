public class LaptopGaming extends Laptop {
    private String gpuDedicated;   
    private String modeKipas;

    public LaptopGaming (String brand, int ram, int ssd, String vgaDedicated){
        super(brand, ram, ssd);
        this.gpuDedicated = gpuDedicated;
        this.modeKipas = "Balanced";
    }

    public void aktifkanModeTurbo(){
        this.modeKipas = "Turbo";
        System.out.println("Mode Turbo Diaktifkan");
    }

    public void setGpuDedicated(String gpu){
        this.gpuDedicated = gpu;
    }
    
    // izin timpa cetak info
    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Merk GPU : " + gpuDedicated);
        System.out.println("Mode kipas : " + modeKipas);
    }
}
