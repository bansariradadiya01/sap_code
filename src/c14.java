//mathod overloading
class Abc{
    int m1;
    int m2;
    int m3;
    public  Abc(int m1,int m2){
        System.out.println(m1+m2);
    }
    public  Abc(int m1,int m2,int m3){
        System.out.println(m1+m2+m3);
    }
    public int  Abc(int m1,int m2){
        return m1+m2;
    }
}
public class c14 {
    public static void main(String[] args) {
        Abc a = new Abc(1,2);
        Abc b = new Abc(1,2,3);

    }
}
