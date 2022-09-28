//remove digit in string
public class str12 {
    public static void main(String[] args) {
String s ="he34ll56oo45";
String result="";
char str[]=s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if(!Character.isDigit(str[i])){
                result=result+str[i];
            }
        }
        System.out.println(result);
    }
}
