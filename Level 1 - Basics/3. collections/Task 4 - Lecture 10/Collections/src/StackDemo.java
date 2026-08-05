import java.util.Stack;

public class StackDemo {
    public static void main (String [] args){

        Stack<Integer> stack = new Stack<>();

        // add
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(100);

        System.out.println(stack);

        // get top element
        System.out.println(stack.peek());

        // update
        stack.set(2,5555);
        System.out.println(stack);

        // search
        System.out.println(stack.contains(100));
        System.out.println(stack.contains(1513));

        // remove
        stack.pop();
        System.out.println(stack);

        stack.pop();
        System.out.println(stack);

    }

}
