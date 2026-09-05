import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.Predicate;

public class NumericStreamsAndReductions {

    public static void main(String[] args) {

        // ============================================================
        // 🔹 NUMERIC STREAMS & REDUCTIONS
        // ============================================================


        // ============================================================
        // 1. Calculate the sum of a list of integers using reduce.
        // ============================================================

        //    List<Integer> numbers = Arrays.asList(10, 5, 3, 7, 2, 10, 5, 8, 9, 0, -3, 4);
        //
        //    int sum = numbers.stream().reduce(0, (a, b) -> a + b);
        //
        //    System.out.println(sum);


        // ============================================================
        // 2. Find the maximum and minimum value in a list.
        // ============================================================

        //    List<Integer> numbers = Arrays.asList(10, 5, 3, 7, 2, 10, 5, 8, 9, 0, -3, 4);
        //
        //    Optional<Integer> max = numbers.stream().max(Integer::compareTo);
        //    Optional<Integer> min = numbers.stream().min(Integer::compareTo);
        //
        //    System.out.println(max.get());
        //    System.out.println(min.get());


        // ============================================================
        // 3. Calculate the average of a list of doubles.
        // ============================================================

        //    List<Double> numbers = Arrays.asList(10.5, 5.0, 3.5, 7.0, 2.0);
        //
        //    OptionalDouble average = numbers.stream().mapToDouble(Double::doubleValue).average();
        //
        //    System.out.println(average.getAsDouble());


        // ============================================================
        // 4. Multiply all integers in a list together using reduce.
        // ============================================================

        //    List<Integer> numbers = Arrays.asList(10, 5, 3, 7, 2, 10, 5, 8, 9, -3, 4);
        //
        //    int mul = numbers.stream().reduce(1, (a, b) -> a * b);
        //
        //    System.out.println(mul);


        // ============================================================
        // 5. Count how many numbers are positive in a list.
        // ============================================================

        //    List<Integer> numbers = Arrays.asList(10, 5, 3, 7, 2, 10, 5, 8, 9, 0, -3, 4);
        //
        //    Predicate<Integer> positive = num -> num>0;
        //
        //    long counter = numbers.stream().filter(positive).count();
        //    System.out.println(counter);

    }
}