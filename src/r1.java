public class r1 {
    public static void print(int i){
        if(i==0){
            return;
        }
        System.out.println(i);
        print(i-1);
    }

    public static void main(String[] args) {
       int i=5;
      print(i);
    }
}
