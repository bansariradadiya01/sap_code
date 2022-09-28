public class strlc23 {
    public static void main(String[] args) {
        String s="xyzzaz";
        int res=0;
        char str[]=s.toCharArray();
        for (int i = 1; i < s.length()-1; i++) 
          if(str[i-1]!=str[i]&&str[i-1]!=str[i+1]&&str[i]!=str[i+1])
              res++;
              System.out.println(res);

    }
}
