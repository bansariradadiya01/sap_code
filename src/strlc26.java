public class strlc26 {
    public static void main(String[] args) {
        String s="00110011";
        int per=0;
        int cur=1;
        int res=0;

        for (int i = 1; i < s.length(); i++) {
            if(s.charAt(i) == s.charAt(i-1)){
               cur++;
            }
            else{
                per=cur;
                cur=1;

            }
            if(per>=cur)
                res++;
        }
        System.out.println(res);
        
    }
}
