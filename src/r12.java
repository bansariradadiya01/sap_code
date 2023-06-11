public class r12 {
    static int mul;
    public static double power(double x, long n){
//       if(x==0){
//           return 0;
//       }
//       if(n==0){
//           return 1;
//       }
//        for (int i = 0; i <n ; i++) {
//             mul=x*n;
//            System.out.println( power(x,mul));
//        }
//
//
//        return mul;
//    }
        if(n>1000 || x>10000){
            return 0;
        }
        if(n==0){
        return 1;
        }
        if(n<0){
            n=-n;
            x=1/x;
        }
        return x*power(x,n-1);
    }
    public static void main(String[] args) {
        System.out.println( power(0.00001,214756565));
    }

}
