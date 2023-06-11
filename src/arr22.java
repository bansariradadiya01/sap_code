public class arr22 {
    public static void main(String[] args) {
        int arr[]={3,2,4};
        int i=0;
        int n=arr.length;
        int count=0;
        while(i<n){
            if(arr[i]!=arr[i+1]){
                count++;
            }
            else{
                count=0;
            }
            System.out.println(count);
            break;
        }
            }

}
