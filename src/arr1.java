public class arr1 {
    public static void main(String[] args) {
        int arr[] = new int[10];
        int length=0;

        System.out.println("is empty:" + isEmpty(length));
        length = insert(arr, length, 10);
        length = insert(arr, length, 20);
        length = insert(arr, length, 30);
        System.out.println("Before update");
        display(arr, length);
        update(arr, length, 20, 40);
        System.out.println("after update");
        display(arr, length);
        System.out.println("after delete");
        length = delete(arr, length, 10);
        length = delete(arr, length, 40);
        length = delete(arr, length, 30);
        display(arr, length);
        System.out.println("size" + size(length));
        System.out.println(("isEmpty") + isEmpty(length));

    }

    private static boolean isEmpty(int length) {
        if (length < 1) {
            return true;
        }
        return false;
    }

    private static int size(int length) {
        return length;
    }

    private static int delete(int[] arr, int length, int value) {
        for (int i = 0; i < length; i++) {
            if (arr[i] == value) {
                int j = i;
                for (j = 0; j < length; j++) {
                    arr[j] = arr[j + 1];
                }
                length--;
            }
        }
        return length;
    }

    private static void update(int[] arr, int length, int value1, int value2) {
        for (int i = 0; i < length; i++) {
            if (arr[i] == value1) {
                arr[i] = value2;
                return;
            }
        }
        System.out.println("value is not present");
    }

    private static int insert(int[] arr, int l, int value) {
        if (l == arr.length) ;
        System.out.println("array is full");


    arr[l]=value;
    l++;
        return l;
}
    private static void display(int[]arr,int length){
        for(int i=0;i<length;i++){
            System.out.println(arr[i]+"");
        }
    }
    }

