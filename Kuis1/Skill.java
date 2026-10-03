class Skill {
    private String nama;
    private int biayaEnergi;
    private int damage;

    public Skill(String nama, int biayaEnergi, int damage) {
        this.nama = nama;
        this.biayaEnergi = biayaEnergi;
        this.damage = damage;
    }

    public String getNama() {
        return nama;
    }

    public int getBiayaEnergi() {
        return biayaEnergi;
    }

    public int getDamage() {
        return damage;
    }
}