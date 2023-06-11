import java.util.LinkedList;
import java.util.Queue;

public class q2s {
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();
        insert(queue,10);
        insert(queue,70);
        insert(queue,40);
        delete(queue);
    }

    private static Queue<Integer> delete(Queue<Integer> queue) {
        Queue <Integer> queue2=new LinkedList<>();
        while(queue.size()>1){
            queue2.add(queue.poll());
        }
        System.out.println(queue.poll());
        return queue2;
    }

    private static void insert(Queue<Integer> queue, int value) {
       queue.add(value);
    }
}
