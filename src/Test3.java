class Pen {
    String color;
    String type;
    public void write(){
        System.out.println(this.color);
        System.out.println(this.type);
    }
}
public class Test3 {
    public static void main(String[] args) {
        Pen p=new Pen(); 
        p.color="black";
        p.type="boll";
        p.write();
    }
}
