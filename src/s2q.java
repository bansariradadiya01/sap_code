import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class s2q {
    public static void main(String[] args) {
        Stack <Integer> stack1= new Stack<>();
        insert(stack1,10);
        insert(stack1,20);
        insert(stack1,30);
        delete(stack1);
    }

    private static void delete(Stack<Integer> stack1) {
        Stack <Integer> stack2= new Stack<>();
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        System.out.println(stack2.pop());
        while (!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
    }

    private static void insert(Stack<Integer> stack1, int value) {
        stack1.push(value);
    }
}
