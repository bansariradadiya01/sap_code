 class Circle1 {
private int r;

     public int getR() {
         return r;
     }

     public void setR(int r) {
         this.r = r;
     }

     public Circle1(int r) {
         this.r = r;
     }

     public double area() {
         return r*r*3.14;
     }
 }
public class c8 {
    public static void main(String[] args) {
   Circle1 c = new Circle1(2 );
c.setR(2);
        System.out.println(c.getR());
        System.out.println(c.area());
    }
}
