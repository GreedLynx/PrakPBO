package karakter1;

import Karakter2.KarakterLari;
import core.KarakterBase; 

public class KarakterLompat extends KarakterBase {

    private KarakterLari partner; 

    public KarakterLompat(String nama, int nyawa) {
        super(nama, nyawa);
    }

    public void setPartner(KarakterLari partner) {
        this.partner = partner;
    }

    @Override
    public void aksi() {
        System.out.println(getNama() + " siap melompat dan merunduk bersama partner!");
    }

    // Loncat biasa: Memicu partner (Karakter 2) ikut menginjak 1 musuh
    public void loncat() {
        setPosisiY(getPosisiY() + 10);
        System.out.println(getNama() + " loncat! Y=" + getPosisiY());
        
        if (partner != null) {
            System.out.println("-> [Keterikatan] Karakter 2 ikut terbawa lompat!");
            partner.injakMusuh(); // Efek ke Karakter 2
        }
    }

    // Overloading loncat dengan parameter tinggi: Memicu partner menginjak musuh combo
    public void loncat(int tinggi) {
        setPosisiY(getPosisiY() + tinggi);
        System.out.println(getNama() + " loncat tinggi " + tinggi + "! Y=" + getPosisiY());
        
        if (partner != null) {
            System.out.println("-> [Keterikatan] Karakter 2 memanfaatkan lompatan tinggi untuk combo!");
            partner.injakMusuh(tinggi / 10); // Efek combo ke Karakter 2 berdasarkan tinggi lompatan
        }
    }

    public void merunduk() {
        setPosisiY(getPosisiY() - 5);
        System.out.println(getNama() + " merunduk! Y=" + getPosisiY());
    }
}