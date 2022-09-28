class Squre{
    int side;
    public int area(){
        return side*side;
    }
    public int parameter(){
        return 4*side;
    }
}
class Circle{
    int r;
    public double area(){
        return r*r*3.14;
    }
}
public class c6 {
    public static void main(String[] args) {
        Squre s= new Squre();
        s.side=5;
        Circle c=new Circle();
        c.r=5;
        System.out.println(c.area());

        System.out.println(s.area());
        System.out.println(s.parameter());
    }
}
