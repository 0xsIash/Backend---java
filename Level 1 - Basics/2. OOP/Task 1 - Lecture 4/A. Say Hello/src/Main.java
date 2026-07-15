import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SayHello obj = new SayHello(scanner.next());
        obj.print();
    }
}

