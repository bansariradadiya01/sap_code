//method overridding
class Vehicle{

    public void name(){
        System.out.println("bansi");
    }
}
class Car extends Vehicle{
    public void name(){
        System.out.println("this is class of car");
    }

}
class Bike extends Vehicle{
    public void name(){
        System.out.println("this is class of bike");
    }
}
public class c15 {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.name();
        Bike b=new Bike();
        b.name();
        Car c = new Car();
        c.name();
    }
}
