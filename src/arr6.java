//left rotation
public class arr6 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int d=2;
        for(int i=0;i<d;i++){
       int j;
            int first=arr[0];
            for( j=0;j<arr.length-1;j++) {
                arr[j] = arr[j + 1];
            }
                arr[j] = first;

            }
            System.out.println();
        for(int i=0;i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }

}
