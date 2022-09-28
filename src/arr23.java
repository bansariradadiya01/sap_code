public class arr23 {
    public static void main(String[] args) {
       int count=0;
        int arr[]={1,2,3,3,6,5,2,5,2};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                    count++;
                }

            }
        }System.out.println(count);
    }
}
