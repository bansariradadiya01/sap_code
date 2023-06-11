public class arr5 {
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5,100};
        int max=0;
        for(int i = arr.length-1;i>=0;i--){
            if(max<arr[i]) {
                max=arr[i];
                System.out.println(arr[i]);
                System.out.println(max);
            }
        }
    }
}
