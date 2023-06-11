public class strlc25 {
    public static void main(String[] args) {
        String s= "hello 3 dfy  5 4 ";
        char[] d =s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            boolean r= Character.isDigit(d[i]);
            if(Character.isDigit(d[i]) ){
                int n=Integer.parseInt(String.valueOf(i));
                if(n<=0){
                    System.out.println("no");
                }
            }
        }
        System.out.println("true");
    }
}
