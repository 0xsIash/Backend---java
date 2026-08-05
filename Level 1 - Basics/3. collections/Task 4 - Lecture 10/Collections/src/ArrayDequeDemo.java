import java.util.ArrayDeque;

public class ArrayDequeDemo {

    public static void main(String[] args) {

        ArrayDeque<String> deque = new ArrayDeque<>();

        // Add
        deque.addFirst("B");
        deque.addLast("C");
        deque.addFirst("A");

        System.out.println(deque);

        // Peek
        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());

        // Remove
        deque.removeFirst();
        deque.removeLast();

        System.out.println(deque);

        // Stack
        deque.push("X");
        deque.push("Y");

        System.out.println(deque);

        System.out.println(deque.pop());
        System.out.println(deque);


        // queue
        deque.offer("Z");
        System.out.println(deque);

        deque.offerFirst("A");
        deque.offerLast("B");
        System.out.println(deque);

        deque.poll();
        System.out.println(deque);

        deque.pollLast();
        System.out.println(deque);


    }
}