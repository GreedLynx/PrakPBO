package id.ac.polinema;

public class rectangle {
    int width;
    int height;

    public rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    int area() {
        return width * height;
    }

    int perimeter(){
        return 2 * (width * height);
    }
}
