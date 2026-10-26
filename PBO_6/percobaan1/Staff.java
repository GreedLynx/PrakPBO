package percobaan1;

public class Staff extends Karyawan {
    private int lembur;
    private double gajiLembur;

    public void setLembur(int lembur){
        this.lembur = lembur;
    }

    public int getLembur(){
        return lembur;
    }
    public void setGajiLembur(double gajiLembur){
        this.gajiLembur = gajiLembur;
    }

    public double getGajiLembur(){
        return gajiLembur;
    }

    public double getGaji(int lembur, double gajiLembur){
        return super.getGaji() + lembur * gajiLembur;
    }

    public double getGaji(){
        return super.getGaji() + lembur * gajiLembur;
    }

    public void lihatInfo(){
        System.out.println("NIP     \t:" + this.getNip());
        System.out.println("Nama    \t:" + this.getNama());
        System.out.println("GOlongan\t:" + this.getGolongan());
        System.out.println("Jml lembur\t:" + this.getLembur());
        System.out.println("Gaji Lembur\t:" + this.getGajiLembur());
        System.out.printf("Gaji \t:%.0f\n", this.getGaji());
    }
}
