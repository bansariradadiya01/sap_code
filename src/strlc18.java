public class strlc18 {
    public static void main(String[] args) {
        String s1 ="acb";
        String  s2="cba";
        String s3="cdb";
        int c=0;
        int d=0;
        int e=0;
        for (int i = 0; i < s1.length(); i++) {
         c= s1.charAt(i)-'a';
        System.out.print(c);
    }
        System.out.println(" ");
        for (int i = 0; i < s2.length(); i++) {
             d= s2.charAt(i)-'a';
            System.out.print(d);
        }
        System.out.println(" ");
        for (int i = 0; i < s3.length(); i++) {
            e= s3.charAt(i)-'a';
            System.out.print(e);
        }
        if(e!=(c+d)){
            System.out.println();
            System.out.println("true");
        }
else
        System.out.println("false");

    }
}
