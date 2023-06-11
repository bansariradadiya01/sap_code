//compare string is same or not
public class str6 {
    public static void main(String[] args) {

        int flag=1;
        String s1="good";
        String s2="gooda";
        int len1=s1.length();
        int len2=s2.length();
        char str1[]=s1.toCharArray();
        char str2[]=s2.toCharArray();
        if(len1==len2){
            for (int i = 0; i < len1; i++) {
                if(str1[i]!=str2[i]){
                    flag=0;
                    break;
                }}}
                else {
                    flag=0;

                }
                if(flag==1){
                    System.out.println("equal");
                }
                else System.out.println("not equal");
            }

        }


