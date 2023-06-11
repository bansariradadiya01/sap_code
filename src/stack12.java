import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class stack12 {
    public static void main(String[] args) {

    int n=12345;
        Queue<Integer> queue = new LinkedList<>();
    while (n>0){
    int mod=n%10;
    queue.add(mod);
    n=n/10;
    int rev=0;
    while (!queue.isEmpty()){
        rev=(rev*10)+queue.poll();
    }
        System.out.print(rev);

    }}
}
