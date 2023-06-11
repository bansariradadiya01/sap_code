//count char
public class str4 {
    public static void main(String[] args) {
        int count =0;
        String s= "asd djk";
        int len=s.length();
        for (int i = 0; i < len; i++) {
            if(s.charAt(i)==' '||s.charAt(i)!=' '){
                count++;
            }
        }
        System.out.println(count);
    }
}
