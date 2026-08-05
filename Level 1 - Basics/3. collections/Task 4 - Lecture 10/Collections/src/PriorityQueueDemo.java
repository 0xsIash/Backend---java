import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main (String[] args){
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.offer(40);
        pq.offer(10);
        pq.offer(30);
        pq.offer(20);

        System.out.println(pq);
        System.out.println(pq.peek());

        pq.poll();
        System.out.println(pq);


    }
}
