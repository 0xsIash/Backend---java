import java.util.Scanner;

public class Task2_ConvertStringToInteger {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String text = input.nextLine();

        try {
            int number = Integer.parseInt(text);

            System.out.println("Number = " + number);

        } catch (NumberFormatException e) {
            System.out.println("Invalid number!");
        }

        input.close();
    }
}