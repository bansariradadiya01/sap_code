public class arrq2 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,4};
        int arr1[]={1,6,6,4,8,5};

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr1.length;j++){
                if(arr[i]==arr1[j]){
                    System.out.println(arr[i]);
                }
            }
        }
    }
}
