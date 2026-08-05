import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

    public static void main(String[] args) {

        LinkedHashSet<String> set = new LinkedHashSet<>();

        set.add("Ali");
        set.add("Sara");
        set.add("Aya");
        set.add("Ali");

        System.out.println(set);

        set.remove("Sara");

        System.out.println(set);

        System.out.println(set.contains("Aya"));
    }
}