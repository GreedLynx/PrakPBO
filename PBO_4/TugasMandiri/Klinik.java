public class Klinik {
    private String namaKlinik;
    
    // 1. RELASI AGGREGATION: Dokter disimpan sebagai atribut, tetapi dibuat di luar
    private Dokter dokter;
    
    // 2. RELASI COMPOSITION: RuangKlinik disimpan sebagai atribut dan dibuat di dalam
    private RuangKlinik ruang;

    // Constructor Klinik menerima objek Dokter yang sudah jadi dari luar (Aggregation)
    public Klinik(String namaKlinik, Dokter dokter) {
        this.namaKlinik = namaKlinik;
        this.dokter = dokter;
        
        // Objek RuangKlinik di-instansiasi mandiri di dalam constructor (Composition)
        this.ruang = new RuangKlinik("R-01", "Pemeriksaan Utama");
    }

    public void setDokter(Dokter dokter) {
        this.dokter = dokter;
    }

    // 3. RELASI DEPENDENCY: Pasien hanya menjadi parameter method, tidak disimpan sebagai atribut
    public void prosesPemeriksaan(Pasien pasien, String keluhan) {
        System.out.println("==========================================");
        System.out.println("          LOG PEMERIKSAAN KLINIK          ");
        System.out.println("==========================================");
        System.out.println("Nama Klinik   : " + namaKlinik);
        System.out.println("Lokasi        : " + ruang.getInfo());
        System.out.println("Dokter        : " + dokter.getInfo());
        System.out.println("Pasien        : " + pasien.getInfo());
        System.out.println("Diagnosa/Pesan: " + keluhan);
        System.out.println("Status        : Selesai Diperiksa.\n");
    }
}