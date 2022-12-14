import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Ch11_Stack_Queue {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> q = new LinkedList<>();

        stack.push(0);
        stack.push(1);
        stack.push(2);

        q.offer(0);
        q.offer(1);
        q.offer(2);

        System.out.println("STACK");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        System.out.println("QUEUE");
        while (!q.isEmpty()) {
            System.out.println(q.poll());
        }

    }
}
