public class Segitiga {
    private int sudut;

    public int totalSudut(int sudutA){
        return sudut = 180 - sudutA;
    }

    public int totalSudut(int sudutA, int sudutB){
        return sudut = 180 - (sudutA + sudutB);
    }

    public int keliling(int sisiA, int sisiB, int sisiC){
        return sudut = sisiA + sisiB + sisiC;
    }

    public double keliling(int sisiA, int sisiB){
        return Math.sqrt(Math.pow(sisiA, 2) + Math.pow(sisiB, 2));
    }
}
