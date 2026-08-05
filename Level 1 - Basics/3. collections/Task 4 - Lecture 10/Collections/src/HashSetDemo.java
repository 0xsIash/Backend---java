import java.util.HashSet;

public class HashSetDemo {

    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();

        set.add("Ali");
        set.add("Aya");
        set.add("Ali");

        System.out.println(set);

        System.out.println(set.contains("Aya"));

        set.remove("Aya");

        System.out.println(set);

    }
}