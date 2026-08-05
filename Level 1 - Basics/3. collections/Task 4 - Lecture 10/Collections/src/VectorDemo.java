import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args){
        Vector<Integer> v = new Vector<>();

        // add last
        v.add(2);
        v.add(10);
        v.add(18);
        System.out.println(v);

        // add first
        v.addFirst(100);
        System.out.println(v);

        // add middle
        v.add(1,159);
        System.out.println(v);

        // get
        System.out.println(v.get(2));
        System.out.println(v.getFirst());
        System.out.println(v.getLast());

        // remove
        v.removeFirst();
        System.out.println(v);

        v.removeLast();
        System.out.println(v);

        v.remove(1);
        System.out.println(v);

        v.removeElement(10);
        System.out.println(v);

        // update
        v.set(0,888);
        System.out.println(v);

        // search
        System.out.println(v.contains(100));
        System.out.println(v.contains(888));


    }

}
