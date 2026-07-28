public class Interval {
    private int a;
    private int b;

    public Interval(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void checkInterval() {
        if (a == 0 || b == 0) {
            System.out.print("NO");
        } else if (a == b || a + 1 == b || b + 1 == a) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
    }
}
