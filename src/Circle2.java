public class Circle2 extends Shape {
    private static double radius;

    public Circle2(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return radius * radius * Math.PI;
    }

    @Override
    public double perimeter() {
        return 2 * radius * Math.PI;
    }


}
