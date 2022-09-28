import javax.imageio.stream.ImageInputStream;

//print array using recursion
public class r5 {
//    public static void arr(int arr[],int idx){
//        if(idx==-1) {
//            return;}
//            arr(arr,idx-1);
//            System.out.println(arr[idx]);
//        }

//        if(idx==arr.length){
//            return;
//        }
//        System.out.print(arr[idx]);
//        arr(arr,idx+1);
//
//
//    }
//
//    public static void main(String[] args) {
//        int arr[]={1,2,3,4,5};
//        arr(arr,0);
//public static void main(String[] args) {
//        int arr[]={1,2,3,5,6};
//    arr(arr,arr.length-1);
//
//
//    }
//}
public static void sum(int arr[],int ind){
if(ind==-1){
    return;}
sum(arr,ind-1);
    System.out.println(arr[ind]);
}
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        sum(arr,arr.length-1);
    }
}