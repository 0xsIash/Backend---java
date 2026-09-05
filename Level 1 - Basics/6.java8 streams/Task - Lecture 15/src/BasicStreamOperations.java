import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class BasicStreamOperations {

    public static void main(String[] args) {

        // ============================================================
        // 🔹 BASIC STREAM OPERATIONS
        // ============================================================


        // ============================================================
        // 1. Filter even numbers from a list of integers.
        // ============================================================

        //    List<Integer> numbers = Arrays.asList(10, 5, 3, 7, 2, 10, 5, 8, 9, 0, -3, 4);
        //
        //    Predicate<Integer> isEven = num -> num%2==0;
        //    numbers = numbers.stream().filter(isEven).collect(Collectors.toList());
        //    System.out.println(numbers);


        // ============================================================
        // 2. Find names starting with a specific letter from a list of strings.
        // ============================================================

//            List<String> names = Arrays.asList("Ali", "Mona", "Ahmed", "Sara", "Amr", "Laila", "Kareem", "Nada", "Nour", "Samy", "", null);
//            Scanner input = new Scanner(System.in);
//            System.out.print("Enter Character: ");
//            Character ch = input.next().charAt(0);
//
//            Predicate<String> isChosen = new Predicate<String>() {
//                @Override
//                public boolean test(String name) {
//                    if (name == null || name.isEmpty()){
//                        return false;
//                    };
//
//                    return name.charAt(0) == ch;
//                }
//            };
//
//            names = names.stream().filter(isChosen).collect(Collectors.toList());
//            System.out.println(names);


        // ============================================================
        // 3. Convert all strings to uppercase using stream.
        // ============================================================

        //    List<String> names = Arrays.asList("Ali", "Mona", "Ahmed", "Sara", "Amr", "Laila", "Kareem", "Nada", "Nour", "Samy", "", null);
        //
        //    Function<String , String> upperCase = new Function<String , String>() {
        //        @Override
        //        public String apply(String name) {
        //            if (name == null || name.isEmpty()){
        //                return name;
        //            };
        //
        //            return name.toUpperCase();
        //        }
        //    };
        //
        //    names = names.stream().map(upperCase).collect(Collectors.toList());
        //
        //    System.out.println(names);


        // ============================================================
        // 4. Sort a list of integers in descending order using streams.
        // ============================================================

        //    List<Integer> numbers = Arrays.asList(10, 5, 3, 7, 2, 10, 5, 8, 9, 0, -3, 4);
        //    numbers = numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        //    System.out.println(numbers);


        // ============================================================
        // 5. Remove duplicate elements from a list using distinct().
        // ============================================================

        //    List<Integer> numbers = Arrays.asList(1,2,5,1,4,8,4,1,2,5,1,2,5,10,15,21);
        //    Set<Integer> s = numbers.stream().distinct().collect(Collectors.toSet());
        //
        //    System.out.println(s);

    }
}