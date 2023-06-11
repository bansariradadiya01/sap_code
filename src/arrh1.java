public class arrh1 {
    public static void main(String[] args) {
        int n = 5;
        float arr[]={1.0f,2.2f,3.2f,4.6f,5.6f};
        int s[]={5};
       float sum = 0;
        float avg =0;

        for(int i=0;i<arr.length;i++){
            sum = sum + arr[i];
            avg = avg + sum/arr.length;
            if(n==arr[i]){
                System.out.println("yes present");
            }
            else{
                System.out.println("not present");
            }

        } System.out.println(sum);
        System.out.println(avg);


    }

}
