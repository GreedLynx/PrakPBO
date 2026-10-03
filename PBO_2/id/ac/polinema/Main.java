package id.ac.polinema;

public class Main {
    public static void main(String[] args) {
        rectangle [] shapes = new rectangle[3];
        shapes[0] = new rectangle(6, 4);
        shapes[1] = new rectangle(3, 3);
        shapes[2] = new rectangle(8, 2);
        
        for (rectangle r : shapes){
            System.out.println("Area: " + r.area() + ", Perimeter: " + r. perimeter());
        }

        Student s = new Student("Nadia", "S001", 3.8);
        System.out.println(s.describe());
    }
}
