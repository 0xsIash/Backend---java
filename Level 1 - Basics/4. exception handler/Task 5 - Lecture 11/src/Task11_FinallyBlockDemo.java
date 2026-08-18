public class Task11_FinallyBlockDemo {

    public static void main(String[] args) {

        try {

            System.out.println("Inside try");

            int result = 10 / 0;

            System.out.println(result);

        } catch (ArithmeticException e) {

            System.out.println("Exception caught!");

        } finally {

            System.out.println("Finally always executes!");
        }
    }
}