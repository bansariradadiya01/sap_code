public class strlc27 {
    public static void main(String[] args) {
        String s="abcdefghij";
        int str=s.length();
        char s1[]=s.toCharArray();
        System.out.println(str);
        for (int i = 0; i < s.length(); i++) {
            System.out.println((s1[3*i]-1)-'a');
        }
    }
}
