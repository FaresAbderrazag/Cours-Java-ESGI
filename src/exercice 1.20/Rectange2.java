public class Rectange2 extends Shape {
    private static double width;
    private static double height;

    public Rectange2(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public double perimeter() {
        return 2 * width + 2 * height;
    }


}

