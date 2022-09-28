class Mo{
    String name;
    String rating;
    public Mo(String name,String rating){
        this.name=name;
        this.rating=rating;
    }
    public Mo(String name){
        this.name=name;
        this.rating="2";
    }
    public static Mo[] get1(Mo[] m){
Mo[] mos=new Mo[m.length];
int n=0;
        for (int i = 0; i < m.length; i++) {
            if (m[i].rating.equals("1")) ;
            mos[n] = m[i];
            n++;

        }return mos;
    }

public void display(){
    System.out.println(name+" "+rating);
}

}
public class cc1 {
    public static void main(String[] args) {
        Mo m = new Mo("pathan","1");
        Mo m1 = new Mo("pathan");
        m.display();
        m1.display();
    }
}