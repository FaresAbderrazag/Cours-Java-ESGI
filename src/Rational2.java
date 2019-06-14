public class Rational2 {

    public static void main(String[] args){
        String ch1= args[0];
        String ch2= args[1];


        int n1 = Integer.parseInt(ch1.charAt(0));
        int d1 = Integer.parseInt(ch1.charAt(2));
        int n2 = Integer.parseInt(ch2.charAt(0));
        int d2 = Integer.parseInt(ch2.charAt(2));



        Rational2 r = add(new Rational2(n1 , d1), new Rational2(n2, d2));

        String result = Integer.toString(r.numerator) + "/" + Integer.toString(r.denominator);

        String output = r.toString();

        System.out.println(output);

        assert result.equals("16/32");

    }

    private static Rational2 add(Rational2 r1, Rational2 r2){
        int n1 = r1.numerator;
        int d1 = r1.denominator;
        int n2 = r2.numerator;
        int d2 = r2.denominator;
        return new Rational2(n1* d2 + n2*d1, d1*d2);

    }

    @Override // pour définir mon intention
    //pour afficher l'objet
    public String toString(){
        return (numerator + "/" + denominator );
    }


    int numerator;
    int denominator;

    Rational2 (int numerator, int denominator ){
        this.numerator= numerator;
        this.denominator = denominator;
    }

}
