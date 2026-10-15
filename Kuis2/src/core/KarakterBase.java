package core;

public class KarakterBase {
    private String nama;
    private int posisiX;
    private int posisiY;
    private int nyawa;

    public KarakterBase(String nama, int nyawa) {
        this.nama = nama;
        this.nyawa = nyawa;
        this.posisiX = 0;
        this.posisiY = 0;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getPosisiX() {
        return posisiX;
    }

    public void setPosisiX(int posisiX) {
        this.posisiX = posisiX;
    }

    public int getPosisiY() {
        return posisiY;
    }

    public void setPosisiY(int posisiY) {
        this.posisiY = posisiY;
    }

    public int getNyawa() {
        return nyawa;
    }

    public void setNyawa(int nyawa) {
        this.nyawa = nyawa;
    }

    public void aksi() {
        System.out.println(nama + " melakukan aksi default.");
    }

    public void tampilStatus() {
        System.out.println("=== Status " + nama + " ===");
        System.out.println("Nyawa   : " + nyawa);
        System.out.println("Posisi X: " + posisiX);
        System.out.println("Posisi Y: " + posisiY);
    }
}
