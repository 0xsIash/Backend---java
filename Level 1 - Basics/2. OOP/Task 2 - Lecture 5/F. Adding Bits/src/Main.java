import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();

        Bits obj = new Bits(a,b);
        System.out.print(obj.addingBits());
    }
}

