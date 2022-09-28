import static java.lang.Integer.MIN_VALUE;

public class arr16 {
    public static void main(String[] args) {
        int arr[]={2,-3,4,-5,6,-4,-5};
        int max=MIN_VALUE;
        int current=0;
        for(int i=0;i<arr.length;i++){
            current=current+arr[i];
            if(current>max){
                max=current;
            }
            if(current<0){
                current=0;
            }
        }
        System.out.println(max);

    }
}
