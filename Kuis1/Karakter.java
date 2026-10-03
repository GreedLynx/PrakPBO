class Karakter {
    private String nama;
    private int nyawa;
    private int energi;
    
    private Skill[] daftarSkill;
    private int indeksSkill;

    public Karakter(String nama) {
        this.nama = nama;
        this.nyawa = 10;
        this.energi = 10;
        this.daftarSkill = new Skill[3]; // Menampung maksimal 3 skill
        this.indeksSkill = 0;
    }

    public void tambahSkill(Skill skill) {
        if (indeksSkill < 3) {
            this.daftarSkill[indeksSkill] = skill;
            indeksSkill++;
        }
    }

    public String getNama() {
        return nama;
    }

    public int getNyawa() {
        return nyawa;
    }

    public int getEnergi() {
        return energi;
    }

    public Skill getSkill(int index) {
        return daftarSkill[index];
    }

    public boolean isHidup() {
        return this.nyawa > 0;
    }

    public void serang(Karakter target, Skill skill) {
        this.energi -= skill.getBiayaEnergi();
        if (this.energi < 0) this.energi = 0;

        target.nyawa -= skill.getDamage();
        if (target.nyawa < 0) target.nyawa = 0;

        System.out.println(this.nama + " menggunakan skill [" + skill.getNama() + "] ke " + target.getNama() + "!");
        System.out.println("-> Energi " + this.nama + " berkurang " + skill.getBiayaEnergi() + " (Sisa Energi: " + this.energi + ")");
        System.out.println("-> Nyawa " + target.getNama() + " berkurang " + skill.getDamage() + " (Sisa Nyawa: " + target.nyawa + ")");
        System.out.println();
    }
}