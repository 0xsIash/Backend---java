public class Puzzle{
    private long a;
    private long b;
    private long c;
    private long d;

    public Puzzle(long a, long b, long c , long d){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public void checkNumbers(){
        long x1 = a + b - c;
        long x2 = a + b * c;

        long x3 = a - b + c;
        long x4 = a - b * c;

        long x5 = a * b + c;
        long x6 = a * b - c;


        if (x1==d || x2==d || x3==d || x4==d || x5==d || x6==d){
            System.out.print("YES");
        }
        else{
            System.out.print("NO");
        }
    }
}