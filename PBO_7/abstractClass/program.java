package abstractClass;

public class program {
    public static void main(String[] args) {
        Kucing kucingKampus = new Kucing();
        Ikan IkanMas = new Ikan();

        Orang ani = new Orang("Ani");
        Orang budi = new Orang("Budi");

        ani.peliharaHewan(kucingKampus);
        budi.peliharaHewan(IkanMas);

        ani.ajakPeliharaanJalanJalan();
        budi.ajakPeliharaanJalanJalan();
    }
}
