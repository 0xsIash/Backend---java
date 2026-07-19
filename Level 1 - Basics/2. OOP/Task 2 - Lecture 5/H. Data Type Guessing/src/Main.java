import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long k = in.nextLong();
        long a = in.nextLong();

        DataType obj = new DataType(n,k,a);
        System.out.print(obj.Guessing());


    }
}
