class app{
    public String name;
    private String password;

    public String getPassword() {
        return this.password;
    }
    public void setPassword(String pass) {
        this.password = pass;

    }
}
public class test5 {
    public static void main(String[] args) {
        app a = new app();
        a.name="bansi";
        a.setPassword("abs");
        System.out.println(a.name);
        System.out.println(a.getPassword());
    }
}
