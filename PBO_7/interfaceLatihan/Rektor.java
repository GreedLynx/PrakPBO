package interfaceLatihan;

public class Rektor {
    public void beriSertifikatCumlaude(ICumlaude mahasiswaCumlaude){
        System.out.println("Saya REKTOR, memberikan sertifikat cumlaude");
        System.out.println("Selamat! Silahkan perkenalkan diri Anda");

        mahasiswaCumlaude.lulus();
        mahasiswaCumlaude.meraihIPKTinggi();

        System.out.println("--------------------------------------------");
    }

    public void beriSertifikatMawapres(IBerprestasi mahasiswaBerprestasi){
        System.out.println("Saya REKTOR, memberikan sertifikat MAWAPRES.");
        System.out.println("Selamat! Bagaimana Anda bisa berrestasi?");

        mahasiswaBerprestasi.menjuaraiKompetisi();
        mahasiswaBerprestasi.membuatPublikasiIlmiah();

        System.out.println("--------------------------------------------");
    }
}
