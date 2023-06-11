//interface
public class c18 {
    public static void main(String[] args) {
Bank1 b = new Bank1() {
    @Override
    public void printintrestrate1() {

    }
};
b.printintrestrate1();
Bank1.AQ();
    }
}
interface  Bank1{
     void printintrestrate1();
     public static void AQ(){
         System.out.println("here in the method doesnot write body When mathod is static and defult then add body , Because static is call direct classname does not make constructer");
     }

}
class Bank2 implements Bank1{
    @Override
    public void printintrestrate1() {
        System.out.println("qw");
    }
}