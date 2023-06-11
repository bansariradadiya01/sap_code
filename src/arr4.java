public class arr4 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,5};
        int n=5;
        int sum1 =0;
         int sum =0;
         for(int j=0;j<n;j++){

             sum1 = sum1 + arr[j];

         for(int i=j+1;i<arr.length;i++){
             sum = sum + arr[i];
         }}
         sum = sum - sum1;
        System.out.println(sum);


    }
}
