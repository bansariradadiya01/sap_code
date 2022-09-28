public class strlc7 {
    public static void main(String[] args) {
        String s="helloHELLO";
        char str[]=s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if(str[i]>='A'&& str[i]<='Z')
                str[i]=(char)(str[i]-'A'+'a');
        }
        System.out.println(new String(str));
    }
}
