import java.util.*;

public class first2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] marks ={1,2,5,5,7};
        int sum = 0;
        for(int i=0;i<marks.length;i++){
            sum += marks[i];
            System.out.println(marks[i]+sum +" ");
            sum=sum-marks[i];
            System.out.println(sum);
        }
        System.out.println("reverse");
        for(int i=marks.length-1;i>=0;i--)
        {
            System.out.println(marks[i]);
        }

        System.out.println(marks.length);

    }
}
