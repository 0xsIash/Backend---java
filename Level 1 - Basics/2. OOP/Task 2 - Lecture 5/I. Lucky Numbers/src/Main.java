import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        LuckyNumbers obj = new LuckyNumbers(num);
        obj.print();
    }
}


