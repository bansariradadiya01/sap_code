public class strlc28 {
    public static void main(String[] args) {
        String current="10:30";
        String correct="11:50";
        String[] curr = current.split(":");
        String[] corr = correct.split(":");
        int cur = Integer.parseInt(curr[0]) * 60 + Integer.parseInt(curr[1]);
        int cor = Integer.parseInt(corr[0]) * 60 + Integer.parseInt(corr[1]);
        int count = 0;
        while(cur + 60 <= cor) {
            ++count;
            cur += 60;
        }

        while(cur + 15 <= cor) {
            ++count;
            cur += 15;
        }

        while(cur + 5 <= cor) {
            ++count;
            cur += 5;
        }

        while(cur + 1 <= cor) {
            ++count;
            cur += 1;
        }
        System.out.println(count);}
}
