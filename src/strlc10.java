public class strlc10 {
    public static void main(String[] args) {
    String s ="abcde";
    char c[]=s.toCharArray();
    char ch='c';
int k=0;

        for (int i = 0; i < s.length(); i++) {
            if(ch==c[i]){
                k=i;
            }
        }
        char res[]=new char[s.length()] ;
        for (int i = 0; i < k+1; i++) {
            res[i]=c[k-i];
        }
        for (int i = k+1; i < s.length(); i++) {
            res[i]=c[i];
        }
        System.out.println(String.valueOf(res));
    }}



