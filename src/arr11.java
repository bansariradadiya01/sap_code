public class arr11 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int i=0;
        int j=arr.length-1;
        int sum=10;
        while(i<j){
        if(arr[i]+arr[j]==sum){
            System.out.println("present");
            break;
        }
        else if(arr[i]+arr[j]<=sum){
            i++;
        }
        else{
             j--;
        }

    }
        System.out.println("pair not present");
    }
}
