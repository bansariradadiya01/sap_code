//reverse number
public class arr13 {
    public static void main(String[] args) {
        int n=1345;
        int nn=0;
        while(n>0){
            int mod = n%10;
            nn=(nn*10)+mod;
            n=n/10;
        }
        System.out.println(nn);

    }
}
