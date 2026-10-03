package com.polinema.library;

public class kelas {
    public String publicVar = "Alun-alun Kota";
    private final String privateVar = "Buku Harian";
    protected String  protectedVar = "Harta Warisa";
    String defaultVar = "Ruang Tamu";

    public static void main(String[] args) {
        kelas f = new kelas();
        System.out.println(f.publicVar);
        System.out.println(f.privateVar);
        System.out.println(f.protectedVar);
        System.out.println(f.defaultVar);
    }
}