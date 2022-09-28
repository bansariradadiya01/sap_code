public class matrix4 {
    public static void main(String[] args) {


        int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int minr = 0;
        int minc = 0;
        int maxr = arr.length;
        int maxc = arr[0].length;


        for (int i = minr, j = minc; i <= maxr-1; i++) {
            System.out.println(arr[i][j]);
        }
        minc++;


        for (int j = minc, i = maxr; j <= maxc-1; j++) {
            System.out.println(arr[i][j]);
        }
        maxr--;


        for (int i = maxr, j = maxc; i >= minr-1; i--) {
            System.out.println(arr[i][j]);
        }
        maxc--;


        for (int i = minr, j = maxc; j >= minc-1; j--) {
            System.out.println(arr[i][j]);

        }    minr++;
     }
}

