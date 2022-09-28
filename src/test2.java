public class test2 {
    public static void main(String[] args) {
        int arr[] = {4, 7, 9, 1};
        int count;
        int i;
        int a[]=new int[arr.length];
        for ( i = 0; i < arr.length; i++) {
            count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] > arr[j])
                    count++;

            }
            a[i] = count;
        }
        System.out.println(a[i]);
        }

    }
