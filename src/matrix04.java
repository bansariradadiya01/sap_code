import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
//row wise max sum
public class matrix04 {
    public static void main(String[] args) {
        int matrix[][]={{1,2,3},{4,5,6},{7,8,9}};

        int max=0;

        for(int i=0;i<matrix.length;i++){
            int sumRow=0;
            for(int j=0;j<matrix[0].length;j++){
                sumRow = sumRow + matrix[i][j];
    }
            if(sumRow>max){
                max=sumRow;
            }
        }System.out.println(max);
         }
}
