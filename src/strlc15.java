public class strlc15 {
    public static void main(String[] args) {
        String s1="abc";
        String s2="pqr";
        char c1[]=s1.toCharArray();
        char c2[]=s2.toCharArray();
        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s2.length(); j++) {
                if(i==j){
                    System.out.print( c1[i]+c2[j]);
                }
            }
        }
    }}
