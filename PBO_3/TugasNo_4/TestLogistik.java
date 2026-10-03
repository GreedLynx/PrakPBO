import java.util.Scanner;

public class TestLogistik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Kontainer kontainerAlfa = new Kontainer("REQ-9988", "PT. Maju Bersama", 5000);

        System.out.println("Nama Pemilik Kontainer: " + kontainerAlfa.getNamaPemilik());
        System.out.println("Kapasitas Maksimal: " + kontainerAlfa.getKapasitasMaksimal() + " kg");

        System.out.print("\nMasukkan muatan yang ingin ditambahkan (kg): ");
        double muatanTambah = input.nextDouble();
        System.out.println("Memasukkan muatan baru seberat " + muatanTambah + " kg...");
        kontainerAlfa.tambahMuatan(muatanTambah);
        System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg");

        System.out.print("\nMasukkan muatan yang ingin dibongkar/diturunkan (kg): ");
        double muatanTurun = input.nextDouble();
        System.out.println("Membongkar muat/menurunkan barang seberat " + muatanTurun + " kg...");
        kontainerAlfa.turunkanMuatan(muatanTurun);
        System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg");
        
        input.close();
    }
}