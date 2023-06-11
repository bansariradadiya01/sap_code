import static java.lang.Math.max;

public class arr {
    public static void main(String[] args) {
        int matrix[][]={{1,2,3},{4,5,6},{7,8,9}};
        int row= matrix.length;
        int col=matrix[0].length;

        for(int i=0;i<row;i++){
            int max =0;
            for(int j=0;j<col;j++){
            max= max(matrix[i][j],max);

        }
            System.out.println(max);
    }
}}
