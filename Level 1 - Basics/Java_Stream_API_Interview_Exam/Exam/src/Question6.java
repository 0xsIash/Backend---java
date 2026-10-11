import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Question6 {
    public void main(String[] args){
        List<Employee> emp = Arrays.asList(
                new Employee("Ahmad" ,"IT",10000),
                new Employee("Muhammad" ,"IT",15000),
                new Employee("Sara" ,"HR",8000),
                new Employee("Omar" ,"HR",12000),
                new Employee("Ali" ,"Finance",20000)
        );

        Map<String, Double> avg = emp.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary)
                ));

        avg.forEach((department, averageSalary) ->
                System.out.println(department + " : " + averageSalary)
        );
    }
}
