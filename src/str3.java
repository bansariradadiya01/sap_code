//palindrom
public class str3 {
    public static void main(String[] args) {
        String s="madam";
        int l=0;
        int r=s.length()-1;
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                System.out.println("not palindrome");
                return;
            }
            l++;
            r--;
        }
        System.out.println("palindrome");
    }
}
