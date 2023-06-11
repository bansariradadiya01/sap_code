//merge string

public class str13 {
    public static void main(String[] args) {


    String s1="ace";
    String s2="bdf";
    char str1[]=s1.toCharArray();
    char str2[]=s2.toCharArray();
        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s2.length(); j++) {
                if(i==j){
                    System.out.print(str1[i]+""+str2[j]);

                }
            }

        }
}}
