import java.util.LinkedList;
import java.util.Queue;

public class stack10 {
    public static void main(String[] args) {
        //reverse num
        int n=1234;
        Queue<Integer> queue=new LinkedList<>();
        while (n>0){
        int mod=n%10;
        queue.add(mod);
        n=n/10;}
        int rev=0;
        while (!queue.isEmpty()){
            rev=(rev*10)+queue.poll();

        }
        System.out.println(rev);
    }
}
