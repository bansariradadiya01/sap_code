public class r14 {
    public static void reverse(int arr[],int n){
        if(n==-1){
            return;
        }
        reverse(arr,n-1);
        System.out.println(arr[n]);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        reverse(arr,arr.length-1);
    }
}
