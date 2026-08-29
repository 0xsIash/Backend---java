import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Level4 {

    public static void main(String[] args) {

        // Product + HashSet

        Product product1 = new Product("P100", 500);
        Product product2 = new Product("P100", 700);
        Product product3 = new Product("P200", 300);

        Set<Product> products = new HashSet<>();

        products.add(product1);
        products.add(product2);
        products.add(product3);

        System.out.println("Products:");
        System.out.println(products);
        System.out.println("Products count: " + products.size());


        // Student
        Student student1 = new Student(1, "aya@gmail.com");
        Student student2 = new Student(1, "ali@gmail.com");
        Student student3 = new Student(2, "aya@gmail.com");

        System.out.println("\nStudents:");

        // Based on ID
        System.out.println(
                "student1 equals student2 by ID: "
                        + student1.equalsById(student2)
        );

        System.out.println(
                "student1 equals student3 by ID: "
                        + student1.equalsById(student3)
        );


        // Based on Email
        System.out.println(
                "student1 equals student2 by Email: "
                        + student1.equalsByEmail(student2)
        );

        System.out.println(
                "student1 equals student3 by Email: "
                        + student1.equalsByEmail(student3)
        );

        // Car + HashMap
        Car car1 = new Car("ABC123", "Red");
        Car car2 = new Car("ABC123", "Blue");
        Car car3 = new Car("XYZ999", "Black");

        Map<Car, String> cars = new HashMap<>();

        cars.put(car1, "Available");
        cars.put(car2, "Sold");
        cars.put(car3, "Available");

        System.out.println("\nCars:");
        System.out.println(cars);
        System.out.println("Cars count: " + cars.size());

        System.out.println(
                "car1 status: " + cars.get(car1)
        );

        System.out.println(
                "car2 status: " + cars.get(car2)
        );
    }
}