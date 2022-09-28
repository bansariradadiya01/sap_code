
public class test {
    public static void main(String[] args)
    {
        int matrix[][]={{1,2},{3,2}};
        int row=matrix.length;
        int col=matrix[0].length;
        int del;
        for (int i = 0; i < row; i++) {
            del=0;
            for (int j = 1; j < col; j++) {
                if(matrix[i][del]<matrix[i][j]){
                    del=j;
                }
            }
            for (int k = del; k < col-1; k++) {
                matrix[i][k]=matrix[i][k+1];
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col-1; j++) {
                System.out.println(matrix[i][j]);
            }
            System.out.println();
        }
    }}