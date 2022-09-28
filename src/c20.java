//1. Design and develop an interface for Vehicles Consider the example of vehicles like
//bicycle, car and bike. All Vehicles have common functionality such as Gear Change..
//Bicycle, Bike, Car classes should implement functionality in their own class in their own
//way.
//Bicycle: max gear is 2,
//Bike: max gear is 5 and
//Car: max gear is 7
interface Vehicles{
    void GearChange();
}
class Cars implements Vehicles{
    @Override
    public void GearChange() {
        System.out.println("max gear is 7");
    }
}
class Bikes implements Vehicles{
    @Override
    public void GearChange() {
        System.out.println("max gear is 5");
    }
}
class Bicycles implements Vehicles{
    @Override
    public void GearChange() {
        System.out.println("max gear is 2");
    }
}
public class c20 {
    public static void main(String[] args) {
        Cars cars = new Cars();
        cars.GearChange();
        Bikes bikes= new Bikes();
        bikes.GearChange();
        Bicycles bicycles= new Bicycles();
        bicycles.GearChange();
    }
}
