class Stu {
    public int salary;
    int id;
    String name;
    public void Detail(){
        System.out.println("my name is  "+ name);
        System.out.println("id is  "+id);
    }
    public int getSalary(){
        return salary;
    }
}
public class c3 {
    public static void main(String[] args) {
Stu s = new Stu();
        Stu s1 = new Stu();
s.id=2007;
s.name="bansi";
s.salary=1;
        s1.id=3007;
        s1.name="carry";
        s1.salary=2;
    s.Detail();
    s1.Detail();
    int salary=s.getSalary();
        System.out.println(salary);

    }
}
