class student{
    String name;
    int id;



    public void write(){
        System.out.println(this.name);
        System.out.println(this.id);
    }

}
public class test4 {
    public static void main(String[] args) {
        student s = new student();
        s.id=1;
        s.name="bansi radadiya";

        s.write();
    }
}
