//get the largest element in array
public class r10 {
    static int max=0;
    public static void max(int [] arr,int idx){
        if(idx==arr.length){
            System.out.println(max);
            return;
        }
        if(arr[idx]>max){
            max=arr[idx];
        }
        max(arr,idx+1);

    }
    public static void main(String[] args) {
        int[] arr={1,2,15,6,2};
        max(arr,0);
    }

}
