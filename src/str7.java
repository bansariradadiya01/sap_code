//replace the one character
public class str7 {
    public static void main(String[] args) {
        String s1="hello";
        char c = 'h';
        char str1[]=s1.toCharArray();
        for (int i = 0; i < s1.length(); i++) {
            if(str1[i]== c ){
                System.out.println("H");

            }else {
                System.out.println(str1[i]);
            }
        }
    }
}
