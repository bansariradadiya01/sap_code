public class matrix05 {
    public static void main(String[] args) {
        int matrix[][]={{1,2,3},{4,5,6},{7,8,9}};
        int max=0;
        for(int j=0;j<matrix[0].length;j++){
            int sumcolumn = 0;
            for (int i = 0; i < matrix.length; i++) {
                sumcolumn=sumcolumn+matrix[i][j];
            }


        if(max<sumcolumn){
            max = sumcolumn;


        }
            }System.out.println(max);
    }
}
