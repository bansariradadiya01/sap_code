//static
class M{
   public static int sum(int a,int b){
       return a+b;
   }
  static int a=3;

}
public class c16 {
    public static void main(String[] args) {

        int result=M.sum(2,5);
        System.out.println(result);
        System.out.println(M.a) ;
    }
}
