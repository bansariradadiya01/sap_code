//count even odd num
public class arr18 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int c1=0;
        int c2=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                c1++;
            }
            else{
                c2++;
            }
        }
        System.out.println(c1+"  "+c2);
    }
}
