//reverse
public class r7 {
    public static void reverse(int num,int rev){
//        if(num==0){
//            System.out.println(rev);
//            return;
//        }
//        int n=num%10;
//        rev=rev*10+n;
//        reverse(num/10,rev);
//
//    }
//    public static void main(String[] args) {
//        reverse(123,0);
if(num==0){
    System.out.println(rev);
    return ;
}
int n=num%10;
rev=rev*10+n;
reverse(num/10,rev);


    }

    public static void main(String[] args) {
        reverse(321,0);
    }
}
