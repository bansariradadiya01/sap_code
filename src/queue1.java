import java.util.LinkedList;
import java.util.Queue;

public class queue1 {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
            for (int i = 0; i < 5; i++) {
                q.add(i);

            }
            q.add(45);
            q.remove();

            System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q.size());
    }
}
