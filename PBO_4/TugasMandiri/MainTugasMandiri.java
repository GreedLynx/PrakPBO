public class MainTugasMandiri {
    public static void main(String[] args) {
        // Step 1: Buat objek Dokter di luar (Persiapan Agregasi)
        Dokter dokterSpesialis = new Dokter("19920110", "Anisa Rian", "Spesialis Anak");

        // Step 2: Instansiasi Klinik (Otomatis membuat RuangKlinik di dalamnya via Komposisi)
        Klinik klinikSehat = new Klinik("Klinik Medika Sehat", dokterSpesialis);

        // Step 3: Buat objek Pasien di luar
        Pasien pasien1 = new Pasien("P-001", "Budi Santoso");

        // Step 4: Jalankan pemeriksaan (Pasien dikirim via parameter - Dependensi)
        klinikSehat.prosesPemeriksaan(pasien1, "Demam tinggi dan batuk");
    }
}