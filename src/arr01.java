

public class arr01 {
    public static void main(String[] args) {
        int arr[]=new int[10];
        int length=0;
        length= insert(arr,length,12356);
        length= insert(arr,length,12353);
        length= insert(arr,length,1235623);

        display(arr,length);
        update(arr,length,12356,10);

    }

    private static void update(int[] arr, int length, int value1, int value2) {
        for(int i=0;i<length;i++){
            if(arr[i]==value1){
                arr[i]=value2;
                return;
            }
        }
        System.out.println("value is not present");
    }

    private static void display(int[] arr, int length) {
        for(int i=0;i<length;i++){
            System.out.println(arr[i]+" ");
        }
    }

    private static int insert(int[] arr, int length, int value) {
        arr[length]=value;
        length++;

        return length;
    }
}
