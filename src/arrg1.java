public class arrg1 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int max=0;
        int max2=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
               max= arr[i];

            }
        }
        for(int j=0;j<arr.length-1;j++){
            if(arr[j]>max2);
            max2=arr[j];
        }
        System.out.println(max);
        System.out.println(max2);
    }
}
