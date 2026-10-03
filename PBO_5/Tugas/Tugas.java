public class Tugas {
    public static void main(String[] args) {
        // 1. Objek Tiket Kereta (Menggunakan konstruktor tanpa parameter + set atribut manual)
        TiketKereta kereta = new TiketKereta();
        kereta.kodeTiket = "KA-001";
        kereta.namaPenumpang = "Andi";
        kereta.asal = "Malang";
        kereta.tujuan = "Jakarta";
        kereta.setHargaDasar(350000);
        kereta.nomorGerbong = 3;
        kereta.nomorKursi = "12A";

        kereta.tampilKereta();
        System.out.println();

        // 2. Objek Tiket Domestik (Menggunakan konstruktor berparameter)
        TiketDomestik domestik = new TiketDomestik(
            "GA-102", "Sinta", "Surabaya", "Denpasar", 
            900000, "Garuda Indonesia", 25, 75000
        );
        domestik.tampilDomestik();
        System.out.println();

        // 3. Objek Tiket Internasional (Menggunakan konstruktor berparameter)
        TiketInternasional internasional = new TiketInternasional(
            "SQ-205", "Budi", "Jakarta", "Singapura", 
            2500000, "Singapore Airlines", 20, "C1234567", 150000
        );
        internasional.tampilInternasional();
    }
}