public class sdearr1 {
    public static void main(String[] args) {
        int arr[][]= new int[5][5];

        for(int i=0;i<5;i++){
            arr[i][0]=arr[i][i] = 1;

            for(int j=1;j<i;j++){
                arr[i][j]=arr[i-1][j-1]+arr[i-1][j];

                System.out.print(arr[i][j]); }
            System.out.println(" ");
        }

    }
}
