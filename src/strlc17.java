public class strlc17 {
    public static void main(String[] args) {
        String s="abccbaacz";
        char a[]=s.toCharArray();
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(a[i]==a[i+1]){
                System.out.println(a[i]);
                break;
            }i++;
        }
    }
}
