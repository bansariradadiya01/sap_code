public class arr20 {
    public static void main(String[] args) {
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        int i = a.length;
        int j= a[0].length;
        int l=0;
        for (int k = 0; k < i; k++) {
              int temp=a[k][0];
              a[k][0]=a[k][j-1];
              a[k][j-1]=temp;

        }
        for (int k = 0; k < i; k++) {
            for ( l = 0; l < j; l++) {
                System.out.print(a[k][l]+" ");
            }
            System.out.println();
        }
    }

}
