import java.util.Stack;

public class stack6 {
    public static void main(String[] args) {
    String s ="abc*+";
    Stack<String> stc = new Stack<>();
    char[] stack=new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='+' || s.charAt(i) =='*') {
                String s1=stc.peek();
                stc.pop();
                String s2=stc.peek();
                stc.pop();
                String temp=s1+s.charAt(i)+s2;
                stc.push(temp);
            }
            else{
                stc.push(String.valueOf(s.charAt(i)));
            }
        }
        System.out.println(stc);
    }}