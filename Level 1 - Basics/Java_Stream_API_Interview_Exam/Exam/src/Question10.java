import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Question10 {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("Ahmed", "IT", 10000),
                new Employee("Mohamed", "IT", 18000),
                new Employee("Ali", "IT", 15000),
                new Employee("Omar", "IT", 22000),

                new Employee("Sara", "HR", 12000),
                new Employee("Mona", "HR", 16000),
                new Employee("Nour", "HR", 14000),
                new Employee("Hana", "HR", 9000),

                new Employee("Khaled", "Finance", 20000),
                new Employee("Youssef", "Finance", 25000),
                new Employee("Mostafa", "Finance", 18000)
        );

        Map<String, List<Employee>> result = employees.stream()
                .collect(Collectors.groupingBy(e -> e.department));

        result.forEach((department, list) -> {
            System.out.println(department + ":");

            list.stream()
                    .sorted(
                            Comparator.comparingDouble(
                                            (Employee e) -> e.salary
                                    ).reversed()
                                    .thenComparing(e -> e.name)
                    )
                    .limit(3)
                    .forEach(e ->
                            System.out.printf("%-10s %.0f%n",
                                    e.name, e.salary)
                    );
        });
    }
}
