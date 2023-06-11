import java.util.Stack;

public class stack8 {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        Stack<Integer> minstack=new Stack<>();

        System.out.println("push1 "+s.push(20));
        System.out.println("push1 "+s.push(30));

int min=s.peek();
        if(!minstack.isEmpty() && minstack.peek()<s.peek()){
            min=minstack.peek();
        }


        System.out.println("finally"+minstack.push(min));


        s.pop();

            minstack.pop();



        System.out.println(minstack.peek());

    }
}
