public class strlc11 {
    public static void main(String[] args) {
        String s="aaab";
        int n=s.length();
        char arr[]=s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            arr[i]='a';
        }
        if(n%2==0)
            arr[0]='b';
        System.out.println(new String(arr));
    }
}
