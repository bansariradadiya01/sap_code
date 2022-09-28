//avg fo character
public class strlc19 {
    public static void main(String[] args) {
        String s="foobar";
        char c='o';
        int count=0;
         char str[]=s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if(c==str[i]){
                count++;
            }

        }System.out.println(count);
        System.out.println(count*100/s.length());
    }
}
