public class r17 {
    public static void main(String[] args) {
       int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
       int up=0;
       int down=arr[0].length;
       int left=0;
       int right=arr.length;
while(left<right){
            for (int j = left; j < right; j++) {
                System.out.print(arr[up][j]);
            }
            up++;
            for (int i = up; i < down; i++) {
                System.out.print(arr[i][right-1]);
            }
            right--;
            for (int i = right-1; i >=left; i--) {
                System.out.print(arr[down-1][i]);
            }
            down--;
            for (int j = down-1; j >= up; j--) {
                System.out.print(arr[j][left]);
            }
            left++;

    }}
}
