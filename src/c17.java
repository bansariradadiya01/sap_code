import java.sql.SQLOutput;

//abstracttion
abstract class Bank{
    abstract void printintrestrate();
    public void city(){
        System.out.println("50");
    }
}
class SBI extends Bank{
    @Override
    void printintrestrate() {
        System.out.println("4");
    }

}
class BOB extends Bank{
    @Override
    void printintrestrate() {
        System.out.println("5");
    }
}
class kotak extends Bank{
    @Override
    void printintrestrate() {

    }
}
public class c17 {
    public static void main(String[] args) {
    BOB bob= new BOB();
    bob.printintrestrate();
    }

    }

