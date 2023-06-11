public class strlc16 {
    public static void main(String[] args) {
        String s="hello";
        char c[]=s.toCharArray();
        int i=0;
        int j=s.length()-1;
        while(i<j){
            char temp=c[i];
            c[i]=c[j];
            c[j]=temp;
            i++;
            j--;
        }
        System.out.print(new String(c));
        }
    }

