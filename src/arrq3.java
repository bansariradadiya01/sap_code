public class arrq3 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,4};
        int max1=0;
        int max2=0;
        for(int i=0;i<arr.length;i++){
            if(max1<arr[i]){

                max1=arr[i];

            }
            else if(max2<arr[i]){
                max2=arr[i];

            }
        }
        System.out.println("first"+max1+"second"+max2);
    }
}
