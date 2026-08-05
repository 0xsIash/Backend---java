import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();

        // add last
        list.add("Aya");
        list.add("Ali");
        list.add("Omar");

        System.out.println(list);

        // add first
        list.addFirst("Muhammad");
        System.out.println(list);

        // add middle
        list.add(1,"Ahmad");
        list.add(3,"Ali");
        System.out.println(list);

        // get
        System.out.println(list.get(3));

        // update
        list.set(3,"Islam");
        System.out.println(list);

        // search
        System.out.println(list.contains("Aya"));
        System.out.println(list.contains("Duaa"));

        // remove by index
        list.remove(1);
        System.out.println(list);

        // remove by element
        list.remove("Islam");
        System.out.println(list);
    }
}
