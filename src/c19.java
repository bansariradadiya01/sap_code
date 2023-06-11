interface BANK13 {
    void Irate();
}
interface BANK14{
    public void Irate();
}
class BANK15 implements BANK13,BANK14{
    @Override
    public void Irate() {
        System.out.println("25");
    }
}
public class c19 {
    public static void main(String[] args) {
        BANK15 b = new BANK15();
        b.Irate();
    }
}
