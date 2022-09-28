//factorial
public class r2 {
// public static int fact(int n)
// {
//     if(n==0 || n==1){
//         return 1;
//     }
//int i=n*fact(n-1);
//     return i;
// }
// public static void main(String[] args) {
//        int n=4;
//        System.out.println(fact(n));
//
//    }
    public static int fact(int n){
        if(n==0 || n==1){
            return 1;
        }
        int i=n*fact(n-1);
        return i;
    }
    public static void main(String [] args){
        int n=4;
        System.out.println(fact(4));
    }
}
