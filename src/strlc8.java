public class strlc8 {
    public static void main(String[] args) {
        String s ="a1c1e1";
        char arr[]=s.toCharArray();
        for (int i = 1; i < arr.length; i+=2) {
           arr[i]=(char)(arr[i-1]+arr[i]-'0');
            }
        System.out.println(String.valueOf(arr));
        }
    }
