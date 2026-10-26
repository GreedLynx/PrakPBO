package Karakter2;

import core.KarakterBase;
import karakter1.KarakterLompat;

public class KarakterLari extends KarakterBase {
    private int kecepatanLari;
    private int jumlahMusuhDiinjak;

    public KarakterLari(String nama, int nyawa, int kecepatanLari) {
        super(nama, nyawa); // Memanggil constructor KarakterBase
        this.kecepatanLari = kecepatanLari;
        this.jumlahMusuhDiinjak = 0;
    }

    public int getKecepatanLari() {
        return kecepatanLari;
    }

    public void setKecepatanLari(int kecepatanLari) {
        this.kecepatanLari = kecepatanLari;
    }

    public int getJumlahMusuhDiinjak() {
        return jumlahMusuhDiinjak;
    }

    // Method khusus Lari
    public void lari() {
        setPosisiX(getPosisiX() + kecepatanLari);
        System.out.println(getNama() + " berlari kencang dengan kecepatan " + kecepatanLari + " km/jam! Posisi X sekarang: " + getPosisiX());
    }

    // Overloading method lari (berdasarkan durasi)
    public void lari(int durasiDetik) {
        int jarakTempuh = kecepatanLari * durasiDetik;
        setPosisiX(getPosisiX() + jarakTempuh);
        System.out.println(getNama() + " berlari sprint selama " + durasiDetik + " detik sejauh " + jarakTempuh + " meter!");
    }

    // Overriding method tampilStatus dari parent
    @Override
    public void tampilStatus() {
        super.tampilStatus();
        System.out.println("Kecepatan Lari    : " + kecepatanLari + " km/jam");
        System.out.println("Musuh Diinjak     : " + jumlahMusuhDiinjak);
        System.out.println("==========================");
    }

    // Method aksi menginjak musuh
    public void injakMusuh() {
        jumlahMusuhDiinjak++;
        System.out.println(getNama() + " melompat dan menginjak musuh! Total musuh diinjak: " + jumlahMusuhDiinjak);
    }

    // Overloading method injakMusuh (menginjak beberapa musuh sekaligus)
    public void injakMusuh(int jumlahMusuh) {
        jumlahMusuhDiinjak += jumlahMusuh;
        System.out.println(getNama() + " melakukan serangan combo menginjak " + jumlahMusuh + " musuh sekaligus! Total musuh diinjak: " + jumlahMusuhDiinjak);
    }
}