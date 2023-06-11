import java.util.HashSet;

public class hashset2 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int sum=9;
        HashSet<Integer> set=new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            int diff=sum-arr[i];
            if(set.contains(diff)){
                System.out.println("pair is present");
            return ;
            }set.add(arr[i]);
        }
        System.out.println("pair is not present");
    }
}
