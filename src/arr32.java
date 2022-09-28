public class arr32 {
    public static void main(String[] args) {
        int a[][]={{1,1,0},{0,1,0},{1,1,1}};
        int r=a.length;
        int c=a[0].length;

        for (int i = 0; i < r; i++) {
            for (int  j = c-1; j >= 0; j--) {

                System.out.print(a[i][j]);}
        } System.out.println();

    }
}
