public class Rational {

    public static void main(String[] args){
        int n1 = Integer.parseInt(args[0]);
        int d1 = Integer.parseInt(args[1]);
        int n2 = Integer.parseInt(args[2]);
        int d2 = Integer.parseInt(args[3]);

        Rational r = add(new Rational(n1 , d1), new Rational(n2, d2));

        String result = Integer.toString(r.numerator) + "/" + Integer.toString(r.denominator);

        String output = r.toString();

        System.out.println(output);

        assert result.equals("16/32");

    }

