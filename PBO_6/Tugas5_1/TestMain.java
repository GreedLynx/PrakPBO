public class TestMain {
    public static void main(String[] args) {
        // Penerapan Dynamic Method Dispatch:
        // Variabel bertipe superclass (Manusia), tetapi memunjuk ke objek subclass
        Manusia m1 = new Dosen();
        Manusia m2 = new Mahasiswa();

        // Method makan() yang dipanggil disesuaikan secara dinamis dengan tipe objeknya
        m1.makan(); 
        m2.makan(); 
    }
}
