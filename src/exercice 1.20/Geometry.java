public class Geometry {

    public static void main(String[] args) {

        System.out.println(area(new Circle(10)));
        System.out.println(area(new Rectangle(3, 4)));
        assert implice (3,4);
        System.out.println(area(new Square(5)));

        System.out.println(perimeter(new Circle(10)));
        System.out.println(perimeter(new Rectangle(3, 4)));
        //System.out.println(perimeter(new Square(5)));
        double p= perimeter(new Rectangle(3, 4));
        assert p >= 0;
    }

    private static boolean implice(double w, double h) {

        if(w == 0 || h == 0){
            return false;
        }
        return true;
    }

    public static double area(Object shape) {
        if (shape instanceof Circle) {
            Circle c = (Circle) shape;
            return c.radius * c.radius * Math.PI;
        }
        if (shape instanceof Rectangle) {
            Rectangle r = (Rectangle) shape;
            return r.width * r.height;
        }
        if (shape instanceof Square) {
            Square s = (Square) shape;
            return s.side * s.side;
        }
        throw new IllegalArgumentException("Unknown shape: " + shape.getClass());
    }

    public static double perimeter(Object shape) {
        if (shape instanceof Circle) {
            Circle circle = (Circle) shape;
            return 2 * circle.radius * Math.PI;
        }
        if (shape instanceof Rectangle) {
            Rectangle r = (Rectangle) shape;
            return 2 * r.width + 2 * r.height;
        }
        if (shape instanceof Square) {
            Square s = (Square) shape;
            return 4 * s.side;
        }
        throw new IllegalArgumentException("Unknown shape: " + shape.getClass());
    }
}
