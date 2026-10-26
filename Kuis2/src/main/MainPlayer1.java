package main;

import Karakter2.KarakterLari;
import karakter1.KarakterLompat;

public class MainPlayer1 {
    public static void main(String[] args) {
        System.out.println("=== SIMULASI GAME KOOPERATIF (KETERIKATAN KARAKTER) ===\n");

        // Instansiasi kedua karakter
        KarakterLompat player1 = new KarakterLompat("Hero-K1", 100);
        KarakterLari player2 = new KarakterLari("Satria-K2", 100, 15);

        // Menghubungkan relasi kooperatif (Karakter 1 kenal Karakter 2)
        player1.setPartner(player2);

        System.out.println("--- STATUS AWAL ---");
        player1.tampilStatus();
        System.out.println();
        player2.tampilStatus();
        System.out.println();

        // Simulasi Keterikatan Aksi
        System.out.println("--- DEMO AKSI KOOPERATIF ---");
        
        // Saat player1 loncat, player2 akan otomatis ikut menginjak musuh!
        player1.loncat();
        System.out.println();

        player1.loncat(20);
        System.out.println();

        System.out.println("--- STATUS AKHIR (Bisa dilihat status Karakter 2 ikut berubah) ---");
        player1.tampilStatus();
        System.out.println();
        player2.tampilStatus();
    }
}