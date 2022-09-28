//1. Print a matrix  *
//2. Find element from matrix  *
//3. Sum of matrix  *
//4. Find row and column size from given matrix  *
//5. Row / column wise traversal  *
//6. Print matrix in zigzag fashion  *
//7. Find element from sorted matrix
//8. Search in a row wise and column wise sorted matrix  *
//9. Print mirror image of matrix *
//10. Find highest sum among all rows  *
//11. Find highest sum among all columns  *
//12. Matrix diagonal sum of both direction   *
public class matrixlist {
    public static void main(String[] args) {
        int mat[][]={{1,2,3},{4,5,6},{7,8,9}};
        int sum=0;
        int n=mat.length;
        int left=0;
        int right=0;

        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++){
                if(i==j){
                    left = left + mat[i][j];
                }
                if((i+j)==(n-1)){
                    right=right+mat[i][j];
                }

            }
        }
        sum = left + right;
        if(n%2==1){
            sum = sum - mat[n/2][n/2];


        }
        System.out.println(sum);
    }
}
