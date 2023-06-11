//sum od each digits
public class r9 {
    public static void sum(int num,int sum){
        if(num==0){
            System.out.println(sum);
            return;
        }
//        int n=num%10;
//        sum+=n;
//        sum(num/10, sum);

    }

    public static void main(String[] args) {
        sum(135,0);
    }
}
