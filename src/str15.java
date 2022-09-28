//in that string cheak if all words are palindrome or not
public class str15 {
    public static void main(String[] args) {
        String s = "te45y5";
        char str []=s.toCharArray();
        int count=0;
        for (int i = 0; i < s.length(); i++) {
        if(Character.isDigit(str[i])){
            count++;
        }
        }
        if(count==s.length()-count){
            System.out.println("same");
        }
else{
            System.out.println("not");
        }
    }
}
