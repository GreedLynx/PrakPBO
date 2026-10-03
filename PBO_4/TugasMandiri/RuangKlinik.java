public class RuangKlinik {
    private String kodeRuang;
    private String tipe;

    public RuangKlinik(String kodeRuang, String tipe) {
        this.kodeRuang = kodeRuang;
        this.tipe = tipe;
    }

    public String getInfo() {
        return "Ruang " + kodeRuang + " (" + tipe + ")";
    }
}