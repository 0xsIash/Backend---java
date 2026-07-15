import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long l1 = in.nextInt();
        long r1 = in.nextInt();
        long l2 = in.nextInt();
        long r2 = in.nextInt();

        Intervals obj = new Intervals(l1,r1,l2,r2);
        obj.print();

    }
}



