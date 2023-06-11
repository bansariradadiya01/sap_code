import java.lang.reflect.Array;
import java.util.Arrays;

public class arr28 {
    public static void main(String[] args) {
        int a[]={1,5,3,4};

        Arrays.sort(a);
        for (int i = 0; i < a.length-1; i++) {
            if(a[i+1]-a[i]>1){
                System.out.println("false");
                break;
            }
        }
        System.out.println("true");



    }
}
