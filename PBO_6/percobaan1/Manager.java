package percobaan1;

public class Manager extends Karyawan{
    private double tunjangan;
    private String bagian;
    private Staff st[];

    public void setTunjangan (double tunjangan){
        this.tunjangan = tunjangan;
    }

    public double getTunjangan (){
        return tunjangan;
    }

    public void setBagian(String bagian){
        this.bagian = bagian;
    }

    public String getBagian(){
        return bagian;
    }

    public void setStaff(Staff st[]){
        this.st = st;
    }

    public void viewStaff(){
        System.out.println("--------------------------");
        for (Staff st1 : st) {
            st1.lihatInfo();
        }
        System.out.println("--------------------------");
    }

    public void lihatInfo(){
        System.out.println("Manager \t: " + this.getBagian());
        System.out.println("Nip \t: " + this.getNip());
        System.out.println("Nama \t: " + this.getNama());
        System.out.println("Golongan \t: " + this.getGolongan());
        System.out.println("Tunjangan \t: " + this.getTunjangan());
        System.out.println("Gaji \t: " + this.getGaji());
        System.out.println("Bagian \t: " + this.getBagian());
        this.viewStaff();
    }

    @Override 
    public double getGaji(){
        return super.getGaji() + tunjangan;
    }
}
