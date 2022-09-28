class Hday{
    private int date;
   private String month;
    public Hday(int date,String month){
        this.date=date;
        this.month=month;
    }
    public void display(){
        System.out.println(date+" "+month);
    }
    public boolean ismonth(Hday h){
        return this.month.equals(h.month);
    }
    public static double avg(Hday [] hd){
        int sum=0;
        for (int i = 0; i < hd.length; i++) {
            sum=sum+hd[i].date;

        }return sum/ hd.length;

    }
}
public class cc2 {
    public static void main(String[] args) {
        Hday h2=new Hday(15,"january");
        Hday h1=new Hday(5,"jun");
        h1.display();
        h2.display();
        h1.ismonth(h2);

        System.out.println(h2.ismonth(h1));
        Hday []h = new Hday[4];

       h[0]=h2;
       h[1]=h1;

        System.out.println(Hday.avg(h));
        System.out.println("hello world");

    }
}
