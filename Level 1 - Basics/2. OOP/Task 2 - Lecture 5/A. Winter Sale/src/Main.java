import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double discount = in.nextDouble();
        double price = in.nextDouble();

        T_shirt obj = new T_shirt(discount,price);

        double real_price =obj.getRealPrice();

        System.out.printf("%.2f",real_price);
    }
}

