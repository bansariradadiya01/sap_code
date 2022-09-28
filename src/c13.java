class Animals{
    int color;

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    int leg;

    public int getLeg() {
        return leg;
    }

    public void setLeg(int leg) {
        this.leg = leg;
    }
}
class Lion extends Animals{
    int tail;

    public int getTail() {
        return tail;
    }

    public void setTail(int tail) {
        this.tail = tail;
    }
}
class elephant extends Animals{
    int Trunk;

    public int getTrunk() {
        return Trunk;
    }

    public void setTrunk(int trunk) {
        Trunk = trunk;
    }
}
public class c13 {
    public static void main(String[] args) {
        Lion lion=new Lion();
        lion.setTail(1);
        System.out.println(lion.getTail());



        Animals animals= new Animals();
        animals.setColor(3);
        System.out.println(animals.getColor());
        animals.setColor(3);
        System.out.println(animals.getColor());

    }
}
