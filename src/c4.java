class Employee{
    int salary;
    public int getSalary(){
        return salary;
    }
    String name;

    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
}
public class c4 {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.salary=23;
        System.out.println(e.getSalary());

        e.setName("asd");
        System.out.println(e.getName());
    }
}
