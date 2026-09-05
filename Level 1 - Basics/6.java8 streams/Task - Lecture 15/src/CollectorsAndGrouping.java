import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsAndGrouping {

    public static void main(String[] args) {

        // ============================================================
        // 🔹 COLLECTORS & GROUPING
        // ============================================================


        // ============================================================
        // 1. Group a list of students by their department.
        // ============================================================

        //    List<Student> students = Arrays.asList(
        //            new Student("Ali", "IT", 85),
        //            new Student("Mona", "CS", 92),
        //            new Student("Ahmed", "IT", 60),
        //            new Student("Sara", "CS", 70),
        //            new Student("Omar", "IS", 45),
        //            new Student("Laila", "IS", 78)
        //    );
        //
        //    Map<String, List<Student>> studentsByDepartment = students.stream().collect(Collectors.groupingBy(Student::getDepartment));
        //
        //    System.out.println(studentsByDepartment);


        // ============================================================
        // 2. Partition a list of numbers into even and odd using partitioningBy.
        // ============================================================

        //    List<Integer> numbers = Arrays.asList(10, 5, 3, 7, 2, 10, 5, 8, 9, 0, -3, 4);
        //
        //    Map<Boolean, List<Integer>> result = numbers.stream().collect(Collectors.partitioningBy(num -> num % 2 == 0));
        //
        //    System.out.println(result);


        // ============================================================
        // 3. Create a comma-separated string from a list of strings.
        // ============================================================

        //    List<String> names = Arrays.asList("Ali", "Mona", "Ahmed", "Sara");
        //    String result = names.stream().collect(Collectors.joining(","));
        //
        //    System.out.println(result);


        // ============================================================
        // 4. Group employees by age and count how many per age.
        // ============================================================

        //    List<Employee> employees = Arrays.asList(
        //            new Employee("Ali", 30, "HR", 5000),
        //            new Employee("Mona", 25, "IT", 7000),
        //            new Employee("Ahmed", 30, "HR", 5500),
        //            new Employee("Sara", 27, "IT", 7200),
        //            new Employee("Omar", 40, "Finance", 8000),
        //            new Employee("Laila", 35, "Finance", 8200)
        //    );
        //
        //    Map<Integer, Long> employeesByAge = employees.stream()
        //            .collect(Collectors.groupingBy(
        //                    Employee::getAge,
        //                    Collectors.counting()
        //            ));
        //
        //    System.out.println(employeesByAge);


        // ============================================================
        // 5. Find the average salary per department in a list of employees.
        // ============================================================

        //    Map<String, Double> averageSalaryByDepartment =
        //            employees.stream()
        //                    .collect(Collectors.groupingBy(
        //                            Employee::getDepartment,
        //                            Collectors.averagingDouble(Employee::getSalary)
        //                    ));
        //
        //    System.out.println(averageSalaryByDepartment);

    }
}