import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long memo = in.nextLong();
        long momo= in.nextLong();
        long k= in.nextLong();

        Game obj = new Game(memo,momo,k);
        obj.winner();

    }

}

