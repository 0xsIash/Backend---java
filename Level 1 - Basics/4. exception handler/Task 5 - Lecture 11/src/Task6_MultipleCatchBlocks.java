public class Task6_MultipleCatchBlocks {

    public static void main(String[] args) {

        String text = null;

        try {

            int number = 10 / 0;

            System.out.println(number);

            System.out.println(text.toUpperCase());

        } catch (ArithmeticException e) {

            System.out.println("Cannot divide by zero!");

        } catch (NullPointerException e) {

            System.out.println("String is null!");
        }
    }
}