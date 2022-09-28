//zigzag
public class matrix2 {
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                for(int j=0;j<arr.length;j++)
                System.out.print(arr[i][j]);
                System.out.println(); }

            else{
                for(int j=0;j<arr.length;j++)
                    System.out.print(arr[i][arr.length-j-1]);
                System.out.println();
            }
        }
    }
}
