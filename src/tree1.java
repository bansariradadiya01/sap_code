import java.util.LinkedList;
import java.util.Queue;

public class tree1 {
    public static void main(String[] args) {
//    int a[][]={{1,3,1},{4,5,6}};
//    int m=a.length;
//    int n=a[0].length;
//
//        for (int i = 1; i < m; i++) {
//            a[i][0]+=a[i-1][0];
//        }
//        for(int j=1;j<n;j++){
//            a[0][j]+=a[0][j-1];
//        }
//        for (int i=1;i<m;i++){
//            for (int j = 1; j < n; j++) {
//                a[i][j]+=Math.min(a[i-1][j],a[i][j-1]);
//            }
//        }
//        System.out.println(a[m-1][n-1]);
//
//        int arr[]={1,2,3};
//        for (int i = 0; i < arr.length; i++) {
//
//
//        System.out.print(arr[i]);
//        int n=arr[i]+1;
//
//            System.out.print(n);}
//        int n=5
//                ;
//        int result=n%2==0?0:1;
//        System.out.println(result);
        int arr[]={56,63,87,24,32,13,15,19,44,52};
        int sum1=0;
        int sum2=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0){
                sum1+=arr[i];
            }
            else{
                sum2+=arr[i];
            }
        }
        System.out.println(sum2-sum1);
        
    }}
