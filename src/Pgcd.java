public class Pgcd {
    public static void main(String[] args){
        int a = Integer.parseInt(args[0]);

        int b = Integer.parseInt(args[1]);
        Pgcd gcd = new Pgcd(a, b);
        int result = gcd.computeGcd();

        System.out.println(result);
    }

    int a;
    int b;

    public Pgcd (int a, int b){
        this.a = a;
        this.b = b;
    }
    public int computeGcd(){
        return computeGcd(a,b);
    }

    private int computeGcd(int a, int b){
        if(b == 0){
            return a;
        }
        return computeGcd(b, a%b);
    }

}

