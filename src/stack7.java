 import java.util.Stack;

public class stack7 {
    public static void main(String[] args) {
        String str="+*abc";
        Stack<String> stk = new Stack<String>();
// char[] stack=new char[str.length()];
 for (int i = str.length()-1; i>=0; i--) {
 if (str.charAt(i)=='+'||str.charAt(i)=='-'||str.charAt(i)=='*'||str.charAt(i)=='/'){
       String s1=stk.peek();
        stk.pop();
        String s2=stk.peek();
        stk.pop();
        String temp=s1+str.charAt(i)+s2;
        stk.push(temp);
 }else {
 stk.push(String.valueOf(str.charAt(i)));
 }
 }
System.out.println(stk);
    }
}
