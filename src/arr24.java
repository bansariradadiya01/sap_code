public class arr24 {
    public static void main(String[] args) {

        int arr[]={1,2,1,4,5};
        int even = 0, odd = 0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]%2==0)
                even++;
            else
                odd++;
        }
        System.out.println(odd+" "+even);
    }
}
