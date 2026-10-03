public class Topi {
    public String warna;
    public int ukuranStrap;
    
    public Topi(String warna, int ukuranStrap){
        this.warna = warna;
        this.ukuranStrap = ukuranStrap;
    }
    public int setUkuranStrap (int level){
        return ukuranStrap = level;
    }

    public String setWarna (String warnaBaru){
        return warna = warnaBaru;
    }

    public void cetakInfoTopi(){
        System.out.println("Warna topi : " + warna);
        System.out.println("Ukuran Strap : " + ukuranStrap);
    }
}