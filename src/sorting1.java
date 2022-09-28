import java.util.Arrays;

public class sorting1 {
    public static void main(String[] args) {
        int arr[]={4,1,2,0};
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i; j < arr.length; j++) {
//                if(arr[j]<arr[i]){
//                    int temp=arr[i];
//                    arr[i]=arr[j];
//                    arr[j]=temp;
//                }
//            }
//            System.out.print(arr[i]+" ");
//        }
//int pos;
//int temp;
//
//        for (int i = 0; i < arr.length; i++) {
//            pos=i;
//            for (int j = i; j < arr.length; j++) {
//                if(arr[j]<arr[pos]){
//                    pos=j;
//                }
//            }
//            temp=arr[pos];
//            arr[pos]=arr[i];
//            arr[i]=temp;
//        }
//        for (int i = 0; i <arr.length ; i++) {
//            System.out.print(arr[i]+" ");
//        }

        int temp;
        int pos;
        for (int i = 0; i < arr.length; i++) {
            pos=i;
            for (int j = i; j < arr.length; j++) {
                if(arr[j]<arr[pos]){
                    pos=j;
                }
            }
            temp=arr[pos];
            arr[pos]=arr[i];
            arr[i]=temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
