public class strlc22 {
    public static void main(String[] args) {
        String s="aabab";
        char str[]=s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if(str[i]=='b'){
                if(str[i+1]=='a'){
                    System.out.println("false");
                    return;
                }
                System.out.println("true");
                return;
            }
        }
    }
}
