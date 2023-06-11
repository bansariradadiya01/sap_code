import java.util.Arrays;

public class arr31 {
    public static void main(String[] args) {
       int a[]={5,6,2,7,4};//42-8=34
       int min=Integer.MAX_VALUE;
       int min2=Integer.MAX_VALUE;
       int max=0;
       int max2=0;
        for (int i = 0; i < a.length; i++) {
        if(min>a[i]){
            min2=min;
            min=a[i];
        }

       else if(min2>a[i]){
            min2=a[i];
        }
        if(max<a[i]){
            max2=max;
            max=a[i];

        }
        else if(max2<a[i]){
            max2=a[i];
        }
        }

        System.out.println((max*max2)-(min*min2));
    }}

