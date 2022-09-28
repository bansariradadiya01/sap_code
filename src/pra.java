public class pra {
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        int v=10;
        int col =arr[0].length;
        for(int i=0;i<col;i++){
        int left=0;
        int right=col-1;
        while(left<=right) {
            int mid = (left + right) / 2;
            if (v == arr[i][mid]) {
                System.out.println("present");
                return;
            } else if (v > arr[i][mid]) {
                left = mid + 1;

            } else {
                right = mid - 1;
            }


        }   } System.out.println("not present");


    }
}
