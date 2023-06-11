public class arr26 {
    public static void main(String[] args) {
        int arr[]={1,4,2,5,3};
        int ans=0;
        for (int i = 0; i < arr.length;i++) {
            for (int j = i; j < arr.length; j++) {
                int sum=0;
                if((j-i+1)%2==1){
                 sum=0;
                for (int k = i; k < j+1; k++) {
                    sum=sum+arr[i];
                }
                    ans=ans+sum;
                }
            }
        }
        System.out.println(ans);
    }
}

