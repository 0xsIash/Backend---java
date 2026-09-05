import java.util.*;
import java.util.stream.Collectors;

public class AdvancedOperations {
    public static void main(String[] args) {

        // ============================================================
        // 🔹 BASIC STREAM OPERATIONS
        // ============================================================



        // ============================================================
        // 1. Sort a list of employees by salary then by name.
        // ============================================================

//        List<Employee> employees = Arrays.asList(
//                new Employee("Ali", 30, "HR", 5000),
//                new Employee("Mona", 25, "IT", 7000),
//                new Employee("Ahmed", 30, "HR", 5500),
//                new Employee("Sara", 27, "IT", 7200),
//                new Employee("Omar", 40, "Finance", 8000),
//                new Employee("Laila", 35, "Finance", 8200)
//        );
//
//        List<Employee> result = employees.stream().sorted(
//                Comparator.comparing(Employee::getSalary)
//                        .thenComparing(Employee::getName))
//                .collect(Collectors.toList());
//        System.out.println(result);

        // ============================================================
        // 2. Find the second highest number in a list.
        // ============================================================

//        List<Integer> numbers = Arrays.asList(10, 5, 3, 7, 2, 10, 5, 8, 9, 0, -3, 4);
//
//        int secondHighest = numbers.stream().distinct()
//                .sorted(Comparator.reverseOrder())
//                .skip(1)
//                .findFirst()
//                .orElseThrow();
//
//        System.out.println(secondHighest);

        // ============================================================
        // 3. Find duplicate elements in a list of integers.
        // ============================================================

//        List<Integer> numbers = Arrays.asList(10, 5, 3, 7, 2, 10, 5, 8, 9, 0, -3, 4);
//        Set<Integer> duplicates = numbers.stream()
//                .filter(n -> Collections.frequency(numbers,n) > 1)
//                .collect(Collectors.toSet());
//        System.out.println(duplicates);

        // ============================================================
        // 4. Remove null or empty strings from a list using stream.
        // ============================================================


//        List<String> names = Arrays.asList("Ali", "Mona", "Ahmed", "Sara", "Amr", "Laila", "Kareem", "Nada", "Nour", "Samy", "", null);
//        List<String> result = names.stream()
//                .filter(Objects::nonNull)
//                .filter(name -> !name.isEmpty())
//                .collect(Collectors.toList());
//
//        System.out.println(result);


        // ============================================================
        // 5. Partition students into pass/fail groups based on grade.
        // ============================================================

//        List<Student> students = Arrays.asList(
//                new Student("Ali", "IT", 85),
//                new Student("Mona", "CS", 92),
//                new Student("Ahmed", "IT", 60),
//                new Student("Sara", "CS", 70),
//                new Student("Omar", "IS", 45),
//                new Student("Laila", "IS", 78)
//        );
//
//        Map<Boolean, List<Student>> result = students.stream()
//                .collect(Collectors.partitioningBy(student -> student.getGrade() >= 60));
//
//        System.out.println("Pass: " + result.get(true));
//
//
//        System.out.println("Fail: " + result.get(false));

    }
}
