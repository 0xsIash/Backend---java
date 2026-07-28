import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long m = in.nextLong();
        long k = in.nextLong();

        Matryoshka obj = new Matryoshka(n,m,k);
        System.out.print(obj.Katryoshka());;


    }
}

