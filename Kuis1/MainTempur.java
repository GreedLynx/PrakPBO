public class MainTempur {
    public static void main(String[] args) {
        // Objek Skill
        Skill cubit = new Skill("Cubit", 1, 2);
        Skill pukul = new Skill("Pukul", 2, 3);
        Skill tampar = new Skill("Tampar", 3, 4);

        // Objek Karakter
        Karakter playerUtama = new Karakter("PlayerUtama");
        Karakter musuh = new Karakter("Musuh");

        // Menambahkan Skill
        playerUtama.tambahSkill(cubit);
        playerUtama.tambahSkill(pukul);
        playerUtama.tambahSkill(tampar);

        musuh.tambahSkill(cubit);
        musuh.tambahSkill(pukul);
        musuh.tambahSkill(tampar);

        //Memulai ronde 
        int ronde = 1;

        // Loop pertandingan
        while (playerUtama.isHidup() && musuh.isHidup()) {
            System.out.println("--- Ronde " + ronde + " ---");

            // Mengambil indeks acak 0 - 2 menggunakan Math.random() bawaan Java
            int idxPlayer = (int) (Math.random() * 3);
            Skill skillPlayer = playerUtama.getSkill(idxPlayer);
            playerUtama.serang(musuh, skillPlayer);

            if (!musuh.isHidup()) {
                break;
            }

            int idxMusuh = (int) (Math.random() * 3);
            Skill skillMusuh = musuh.getSkill(idxMusuh);
            musuh.serang(playerUtama, skillMusuh);

            ronde++;
        }

        // Pengumuman pemenang
        System.out.println("=== PERTANDINGAN SELESAI ===");
        if (playerUtama.isHidup()) {
            System.out.println("Pemenang: " + playerUtama.getNama() + "!");
        } else {
            System.out.println("Pemenang: " + musuh.getNama() + "!");
        }
    }
}