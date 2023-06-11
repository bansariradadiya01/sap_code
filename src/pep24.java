public class pep24{
    public static int fact(int x){
        int n=1;
        for(int i=1;i<=x;i++){
            n=n*i;
        }
        return n;
    }
    public static void main(String[] args) {
        int m=5;
        int r=0 ;
        int ans = fact(m)/fact(m-r);
        System.out.println(ans);

    }
}