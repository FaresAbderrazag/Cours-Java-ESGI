public class Geometry2 {

    public static void main(String[] args) {

        /*
        Shape forme1 = new Circle2(10);
        Shape forme2 = new Rectange2(3,4);
        Shape forme3 = new Square2(4);

        */
        /*
        System.out.println(forme1.area());
        System.out.println(forme2.area());
        System.out.println(forme3.area());
        System.out.println(forme1.perimeter());
        System.out.println(forme2.perimeter());
        System.out.println(forme3.perimeter());
        */



        if(args[0].equals("area")){
            if (args[1].equals("Circle")){
                Shape forme = new Circle2(Integer.parseInt(args[2]));
                System.out.println(forme.area());
            }
            if (args[1].equals("Square")){
                Shape forme = new Square2(Integer.parseInt(args[2]));
                System.out.println(forme.area());
            }
            if (args[1].equals("Rectangle")){
                Shape forme = new Rectange2(Integer.parseInt(args[2]), Integer.parseInt(args[3]));
                System.out.println(forme.area());
            }
        }
        if(args[0].equals("perimeter")){
            if (args[1].equals("Circle")){
                Shape forme = new Circle2(Integer.parseInt(args[2]));
                System.out.println(forme.perimeter());
            }
            if (args[1].equals("Square")){
                Shape forme = new Square2(Integer.parseInt(args[2]));
                System.out.println(forme.perimeter());
            }
            if (args[1].equals("Rectangle")){
                Shape forme = new Rectange2(Integer.parseInt(args[2]), Integer.parseInt(args[3]));
                System.out.println(forme.perimeter());
            }
        }
    }

}
