public class r13 {
    public static boolean palindrom(int l, int r, String s) {

        if (l >= r) {
            return true;
        }
        if (s.charAt(l) != s.charAt(r)) {
            return false;
        }
        return palindrom(l + 1, r - 1, s);
    }

    public static void main(String[] args) {
        String s = "ban b";
        System.out.println(palindrom(0, s.length() - 1, s));
    }
}
