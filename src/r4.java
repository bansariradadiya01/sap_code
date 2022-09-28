//fibbonacy
public class r4 {
    public static void fib(int a,int b,int n){
       if(n==0){
           return;
       }
        System.out.println(a);
       fib(b,a+b,n-1);

    }
    public static void main(String[] args) {
        fib(0,1,5);
    }
}
//  if(n<2){
//       return n;
//     }
//      System.out.print(a);
//      fib(b,a+b,n-1);
//      return fib(n-1)+fib(n-2);
//
//      }
//public static void main(String[] args) {
//        fib(0,1,5);
//       System.out.println(fib(7));


