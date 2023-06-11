public class strlc5 {
    public static void main(String[] args) {
        String s="thequickbrownfoxjumpsoverthelazydog";
        if(s.length()<26){
            System.out.println("false");
        }
        String a="abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < a.length(); i++) {
            if (s.indexOf(a.charAt(i)) == -1) {
                System.out.println("false");

            }
        }
        System.out.println("true");
    }
}
