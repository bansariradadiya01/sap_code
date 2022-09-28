public class strlc20 {
    public static void main(String[] args) {
        String s[]={"a","b","ab","abc"};
        String s1="abc";
        int res=0;
        for (String i:s) {
            if(s1.startsWith(i)){
                res++;
            }

        }
        System.out.println(res);
    }
}
