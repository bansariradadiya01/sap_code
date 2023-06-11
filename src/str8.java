//sorting string with character
public class str8 {
    public static void main(String[] args) {
       String s = "bansri";
       char str[]=s.toCharArray();

        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j < s.length(); j++) {
                if(str[i]>str[j]){
                    char temp=str[i];
                    str[i]=str[j];
                    str[j]=temp;
                }
            }
            System.out.println(str[i]);
        }
    }
}
