public class strlc4 {
    public static void main(String[] args) {
String s = "rlrrrllrll";
int l=0;
int r=0;
int score=0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'l') {
                l++;
            } else r++;
            if (l == r)
                score++;
        }
        System.out.println(score);
    }
}
