public class strlc12 {
    public static void main(String[] args) {
        String s="b1";
        char arr[]=s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if(arr[0]=='a'||arr[0]=='c'||arr[0]=='e'||arr[0]=='g'){
                if(arr[1]%2==0){
                    System.out.println("true");
                }
                else System.out.println("false");
                break;
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if(arr[0]=='b'||arr[0]=='d'||arr[0]=='f'||arr[0]=='h'){
                if(arr[1]%2==1){
                    System.out.println("true");
                }
                else System.out.println("false");
                break;
            }
        }
    }
}
