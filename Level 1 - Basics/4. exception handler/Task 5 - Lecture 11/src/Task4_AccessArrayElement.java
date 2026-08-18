import java.util.Scanner;

public class Task4_AccessArrayElement {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numbers = {10, 20, 30, 40, 50};

        System.out.print("Enter index: ");
        int index = input.nextInt();

        try {
            System.out.println("Value = " + numbers[index]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");
        }

        input.close();
    }
}