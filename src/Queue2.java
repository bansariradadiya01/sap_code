import java.util.ArrayDeque;
import java.util.Deque;

public class Queue2 {
     
    public static void main(String[] args) {
        Deque<Integer> deque=new ArrayDeque<>();
        deque.addFirst(1);
        deque.addFirst(4);
        deque.addLast(2);
        deque.addLast(3);
        deque.removeFirst();
        deque.removeLast();
//        int first = deque.removeFirst();
//        int last = deque.removeLast();
//        System.out.println("First: " + first + ", Last: " + last);
      System.out.println(deque);
    }
}