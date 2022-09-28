public class r16 {
    public static void main(String[] args) {
      int arr[]={2,3,1,1,4};
      int count=0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[0]<arr[i]){
                count++;
                i++;
            }
        }
        System.out.println(count);
    }
}
