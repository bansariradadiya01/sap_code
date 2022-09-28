import javax.imageio.stream.ImageInputStream;

//count digit
//public class r6 {
//    static int count=0;
//    public static int digit(int n){
//        if(n>0){
//            count++;
//            digit(n/10);
//        }
//        return count;
//
//    }
//    public static void main(String[] args) {
//        int ans=digit(123);
//        System.out.println(ans);
//    }
//}
public class r6{
    static int count=0;
    public static int digit(int n) {
//        if(n>0){
//            count++;
//            digit(n/10);
//        }
//        return count;
//    }
//    public static void main(String[] args) {
//        int ans=digit(13);
//        System.out.println(ans);
if(n>0){
    count++;
    digit(n/10);
}
return count;}



    public static void main(String[] args) {
        System.out.println(digit(123569));
    }
}