import java.util.Stack;

public class stack11 {
    public static void main(String[] args) {
        //delete the mid value
        Stack<Integer> str=new Stack<>();
        str.push(10);
        str.push(20);
        str.push(40);
        deletemid(str);
        System.out.println(str);

    }

    private static void deletemid(Stack<Integer> str) {
        int size=str.size();
        Stack<Integer> s2= new Stack<>();
        for (int i = 0; i < (size/2); i++) {
            s2.push(str.pop());
        }
        System.out.println(str.pop());
        while (!s2.isEmpty()){
            str.push(s2.pop());
        }
    }
}
