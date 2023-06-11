//dulication
public class str5 {
    public static void main(String arg[]) {
        String str = "good morning";
        
        System.out.println("The string is:" + str);
        System.out.print("Duplicate Characters in above string are: ");
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i)==str.charAt(j)) {
                    System.out.print(str.charAt(j) + " ");
                    break;

                }
            }
        }
    }
}
