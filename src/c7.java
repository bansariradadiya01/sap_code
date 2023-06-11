class Em {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
public class c7 {
    public static void main(String[] args) {
        Em e = new Em();
        e.setId(3);
        System.out.println(e.getId() );
    }
}
