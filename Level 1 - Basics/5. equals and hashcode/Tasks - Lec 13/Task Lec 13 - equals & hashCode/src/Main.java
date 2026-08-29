import java.util.HashSet;
import java.util.Set;

void main() {

    // 🟢 Level 1: Basics of equals & hashCode

//    // Check behavior before overriding equals()
//    PersonL1 p1 = new PersonL1("aya", 21);
//    PersonL1 p2 = new PersonL1("ali", 21);
//
//    System.out.println(p1.equals(p2)); // false


//    // Compare two different objects with same id
//    PersonL1 p1 = new PersonL1("aya", 21);
//    PersonL1 p2 = new PersonL1("ali", 21);
//
//    System.out.println(p1.equals(p2)); // true


//    // Compare two different objects with different id
//    PersonL1 p1 = new PersonL1("aya", 21);
//    PersonL1 p2 = new PersonL1("ali", 10);
//
//    System.out.println(p1.equals(p2)); // false


//    // override equals() but NOT hashCode()
//    PersonL1 p1 = new PersonL1("aya", 21);
//    PersonL1 p2 = new PersonL1("ali", 21);
//
//    System.out.println(p1.equals(p2)); // true
//    System.out.println(p1.hashCode() == p2.hashCode()); // false


//    // override equals() and hashCode()
//    PersonL1 p1 = new PersonL1("aya", 21);
//    PersonL1 p2 = new PersonL1("ali", 21);
//
//    System.out.println(p1.equals(p2)); // true
//    System.out.println(p1.hashCode() == p2.hashCode()); // true



//    // 🟡 Level 2: Working with HashSet
//
//    PersonL2 p1 = new PersonL2("Aya", 21);
//    PersonL2 p2 = new PersonL2("Ali", 21);
//
//    PersonL2 p3 = new PersonL2("Aya", 10);
//    PersonL2 p4 = new PersonL2("Mona", 10);
//
//    PersonL2 p5 = new PersonL2("Islam", 91);
//    PersonL2 p6 = new PersonL2("Islam", 91);
//
//    PersonL2 p7 = new PersonL2("Sara", 30);
//    PersonL2 p8 = new PersonL2("Sara", 40);
//
//    PersonL2 p9 = new PersonL2("Omar", 50);
//    PersonL2 p10 = new PersonL2("Omar", 50);


//    // before overriding methods
//    Set<PersonL2> s = new HashSet<>();
//
//    s.add(p1);
//    s.add(p2);
//    s.add(p3);
//    s.add(p4);
//
//    System.out.println(s); // 4 elements


//    // after overriding hashCode method
//    Set<PersonL2> s = new HashSet<>();
//
//    s.add(p1);
//    s.add(p2);
//    s.add(p3);
//    s.add(p4);
//
//    // p1 and p2 have the same hashCode,
//    // but both exist because equals() was not overridden
//    System.out.println(s);


//    // after overriding equals() and hashCode()
//    Set<PersonL2> s = new HashSet<>();
//
//    s.add(p1);
//    s.add(p2);
//    s.add(p3);
//    s.add(p4);
//
//    // p1 and p2 are equal because they have the same id and name
//    System.out.println(s); // 3 elements


    // Try changing equality logic
//    Set<PersonL2> s = new HashSet<>();
//
//    s.add(p1);
//    s.add(p2);
//    s.add(p3);
//    s.add(p4);
//    s.add(p5);
//    s.add(p6);
//    s.add(p7);
//    s.add(p8);
//    s.add(p9);
//    s.add(p10);
//
//    System.out.println(s);
//    System.out.println(s.size());



//    // 🟠 Level 3: Working with HashMap
//
//
//    // Insert two keys with same id
//    PersonL2 p1 = new PersonL2("Aya", 21);
//    PersonL2 p2 = new PersonL2("Ali", 21);
//
//    Map<PersonL2, String> employees = new HashMap<>();
//
//    employees.put(p1, "Employee");
//    employees.put(p2, "Manager");
//
//    // مفيش حاجة متساوية ف ضاف القيمتين عادي والعنصرين موجودين
//    System.out.println(employees);
//    System.out.println(p1.equals(p2)); // false
//
//    // Test with exactly same key data
//    PersonL2 p3 = new PersonL2("Aya", 21);
//
//    employees.put(p3, "Developer");
//
//    // هنا في عنصرين ليهم نفس ال key ف غير قيمة p1 وخلاها Developer بدل Employee
//    System.out.println(employees);
//    System.out.println(p1.equals(p3)); // true
//
//    // Retrieve using a new object with same data
//    PersonL2 p4 = new PersonL2("Aya", 21);
//
//    System.out.println(employees.get(p4)); // Developer
//
//    // Modify a key after inserting it
//    p1.name = "Duaa";
//
//    System.out.println(employees.get(p1));


//    // 🔵 Level 4: Real-world Scenarios
//    Product p1 = new Product("P100", 500);
//    Product p2 = new Product("P100", 700);
//
//    Set<Product> products = new HashSet<>();
//
//    products.add(p1);
//    products.add(p2);
//
//    System.out.println(products.size());

//    Student s1 = new Student(1, "aya@gmail.com");
//    Student s2 = new Student(1, "ali@gmail.com");
//
//    // equal based on ID
//    System.out.println(s1.equalsById(s2)); // true
//
//    // equal based on Email
//    System.out.println(s1.equalsByEmail(s2)); // false




}