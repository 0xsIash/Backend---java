import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class IntermediateStreamTasks {

    public static void main(String[] args) {

        // ============================================================
        // 🔹 INTERMEDIATE STREAM TASKS
        // ============================================================


        // ============================================================
        // 1. Count the number of strings longer than 5 characters.
        // ============================================================

        //    List<String> names = Arrays.asList("Ali", "Mona", "Ahmed", "Sara", "Amr", "Laila", "Kareem", "Nada", "Nour", "Samy", "", null);
        //
        //    Predicate<String> isChosen = new Predicate<String>() {
        //        @Override
        //        public boolean test(String name) {
        //            if (name == null || name.isEmpty()){
        //                return false;
        //            };
        //
        //            return name.length()>5;
        //        }
        //    };
        //
        //    long counter = names.stream().filter(isChosen).count();
        //    System.out.println(counter);


        // ============================================================
        // 2. Find the first element in a stream that matches a given condition.
        // ============================================================

        //    List<String> names = Arrays.asList("Ali", "Mona", "Ahmed", "Sara", "Amr", "Laila", "Kareem", "Nada", "Nour", "Samy", "", null);
        //
        //    Predicate<String> isChosen = new Predicate<String>() {
        //        @Override
        //        public boolean test(String name) {
        //            if (name == null || name.isEmpty()){
        //                return false;
        //            };
        //
        //            return name.length()>5;
        //        }
        //    };
        //
        //    Optional<String> n = names.stream().filter(isChosen).findFirst();
        //
        //    if (n.isPresent())
        //        System.out.println(n.get());
        //    else
        //        System.out.println("Nothing matches");


        // ============================================================
        // 3. Check if any number is divisible by 5 in a list.
        // ============================================================

        //    List<Integer> numbers = Arrays.asList(10, 5, 3, 7, 2, 10, 5, 8, 9, 0, -3, 4);
        //
        //    Predicate<Integer> isMatch = num -> num%5 == 0;
        //
        //    boolean matched = numbers.stream().anyMatch(isMatch);
        //    System.out.println(matched);


        // ============================================================
        // 4. Collect elements into a Set instead of a List.
        // ============================================================

        //    List<Integer> numbers = Arrays.asList(10, 5, 3, 7, 2, 10, 5, 8, 9, 0, -3, 4);
        //
        //    Set<Integer> s = numbers.stream().collect(Collectors.toSet());
        //    System.out.println(s);


        // ============================================================
        // 5. Skip the first 3 elements and return the rest.
        // ============================================================

        //  List<Integer> numbers = Arrays.asList(10, 5, 3, 7, 2, 10, 5, 8, 9, 0, -3, 4);

        //  List<Integer> result = numbers.stream().skip(3).collect(Collectors.toList());

        //  System.out.println(result);

    }
}