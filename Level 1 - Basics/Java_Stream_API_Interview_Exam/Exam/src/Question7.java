import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Question7 {
    public void main(String[] args){
        List<Employee> employees = Arrays.asList(
                new Employee("Ahmed", "IT", 10000),
                new Employee("Mohamed", "IT", 18000),
                new Employee("Sara", "HR", 9000),
                new Employee("Omar", "HR", 14000),
                new Employee("Ali", "Finance", 20000)
        );

        Map<String,Employee> res = employees.stream()
                .collect(Collectors.toMap(
                        Employee::getDepartment,
                        e->e,
                        (a, b) -> a.getSalary() > b.getSalary() ? a : b
                )
        );

        res.forEach((department, emp)->
                        System.out.println(department+" = "+emp.getName())
                );

    }
}
