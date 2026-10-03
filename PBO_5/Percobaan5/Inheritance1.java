public class Inheritance1 {
    public static void main(String [] args){
        Manager M = new Manager();
        M.nama = "Vivin";
        M.alamat = "Jl. Vionela";
        M.umur = 40;
        M.jk = "Perempuan";
        M.gaji = 3000000;
        M.tunjangan = 100000;
        M.tampilDataManager();

        Staff S = new Staff();
        S.nama = "Lestari";
        S.alamat = "Malang";
        S.umur = 25;
        S.jk = "Perempuan";
        S.gaji = 2000000;
        S.lembur = 50000;
        S.potongan = 25000;
        S.tampilDataStaff();
    }
}
