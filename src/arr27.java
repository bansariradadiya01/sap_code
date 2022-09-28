public class arr27 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        int value = 6;
        for(int i=0;i<arr.length;i++){

            if(arr[i]==value)
            {
                System.out.println("present");
                return;
            }
        }System.out.println("not present");
    }
}
