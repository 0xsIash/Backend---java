import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args){
        LinkedList<String> list = new LinkedList<>();

        // add last
        list.add("Aya");
        list.add("Islam");
        list.add("Omar");

        System.out.println(list);

        // add first
        list.addFirst("Ali");
        System.out.println(list);

        // add middle
        list.add(1,"Ibrahim");
        System.out.println(list);

        // get
        System.out.println(list.get(2));
        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        // remove
        list.removeFirst();
        System.out.println(list);

        list.removeLast();
        System.out.println(list);

        list.remove(1);
        System.out.println(list);

        // update
        list.set(1,"Malek");
        System.out.println(list);

        // search
        System.out.println(list.contains("aya"));
        System.out.println(list.contains("Malek"));



    }
}
