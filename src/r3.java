public class r3 {
//    public static void printsum(int n,int sum){
//        if(n==0){System.out.println(sum);
//            return;
//        }
//
//
//        sum+=n;
//        printsum(n-1,sum);
//    }
//    public static void main(String[] args) {
//
//        printsum(5,0);
//    }

    public static int sum(int n){
        if(n==0){
            return 0;
        }
        return n+sum(n-1);
    }
    public static void main(String[] args) {
        System.out.println(sum(5));
    }
}
