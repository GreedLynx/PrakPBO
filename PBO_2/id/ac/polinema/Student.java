package id.ac.polinema;

public class Student {
    private String nama;
    private String StudentId;
    private double gpa;

    public Student(String nama, String StudentId, double gpa){
        this.nama = nama;
        this.StudentId = StudentId;
        this.gpa = gpa;
    }

    public String describe(){
        return nama + " (" + StudentId + ", GPA: " + gpa + ")";
    }
}
