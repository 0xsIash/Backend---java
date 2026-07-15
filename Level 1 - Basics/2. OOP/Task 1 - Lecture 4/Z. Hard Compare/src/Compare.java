public class Compare {
    long a, b, c, d;

    Compare(long a, long b, long c, long d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public void print() {
        if (b * Math.log(a) > d * Math.log(c)) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
    }
}