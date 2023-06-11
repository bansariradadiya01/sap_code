import java.util.Stack;

public class pep28 {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(100);
        st.push(100);
        st.push(100);
        st.pop();
        System.out.println(st.peek());
        System.out.println(st.size());
    }
}
