public class arrh3 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        for(int i=0;i<arr.length;i++)
            if(arr[i]<arr[i+1]){
                System.out.println("element is sorted");
                break;
            }
            else{
                System.out.println("notsorted");
            }

        }
}
