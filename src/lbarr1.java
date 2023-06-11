public class lbarr1 {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{4,5,100},{120,150,170}};
        int row = mat.length;
        int col = mat[0].length;
        int val = 115;
        int top = 0;
        int bottom = row-1;
        int rowToSearch = -1;
        while (top <= bottom){
            int mid = (top+bottom) / 2;
            if(val >= mat[mid][0] && val <= mat[mid][col-1]){
                rowToSearch = mid;
                break;
            }else if(val > mat[mid][col-1]){
                top = mid+1;
            }else {
                bottom = mid-1;
            }
        }
        if (rowToSearch == -1){
            System.out.println("value not present");
            return;
        }
        int left=0, right=col-1;
        while (left <= right){
            int mid = (left + right) / 2;
            if(val == mat[rowToSearch][mid]){
                System.out.println("value is present");
                return;
            }else if(val > mat[rowToSearch][mid]){
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }
        System.out.println("value not present");
    }
}
 