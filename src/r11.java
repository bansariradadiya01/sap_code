public class r11 {
    public static void prime(int num,int i){
        if(num==i){
            System.out.println("number is prime");
            return;
        }
        if(num%i==0){
            System.out.println("number are not prime");
            return;
        }
        prime(num,i+1);
    }
    public static void main(String[] args) {

        prime(11,2);
    }
}
