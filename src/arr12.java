public class arr12 {
    public static void main(String[] args) {
        int arr[]={1,1,3,5,5};
        for(int i=0;i<arr.length-1;i++){
            boolean isUnique=false;
            for(int j=0;j<i;j++){
                if(arr[i]==arr[j]){
                    isUnique=true;
                    break;
                }
            }
            if(!isUnique){
                System.out.println(arr[i]+" ");
            }
        }
    }
}
