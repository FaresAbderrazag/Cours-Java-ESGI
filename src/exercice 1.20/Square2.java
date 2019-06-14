public class Square2 extends Shape {
    private static double side;

    public Square2(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public double perimeter() {
        return 4 * side;

    }

}
