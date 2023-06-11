public class strlc6 {
    public static void main(String[] args) {
       String s ="(1+(2*3)+((8)/4))+1" +
               "";
       int res=0;
       int cur=0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='(')
                res=Math.max(res,++cur);
            if(s.charAt(i)==')')
                cur--;
        }
        System.out.println(res);
    }
}
