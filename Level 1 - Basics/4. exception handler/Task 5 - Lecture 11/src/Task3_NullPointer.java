public class Task3_NullPointer {

    public static String convertToUpperCase(String text) {
        return text.toUpperCase();
    }

    public static void main(String[] args) {

        String name = null;

        try {
            String result = convertToUpperCase(name);

            System.out.println(result);

        } catch (NullPointerException e) {
            System.out.println("The string is null!");
        }
    }
}