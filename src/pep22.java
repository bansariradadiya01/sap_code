//1
//1 1
//1 2 1
//1 3 3 1
//1 4 6 4 1
//1 5 10 10 5 1
public class pep22 {public static void main(String[] args) {
    int n=6;

    for(int i=0;i<n;i++){
        int sum = 1;
        for(int j=0;j<=i;j++){
            System.out.print(sum+" ");
            int sum1=sum*(i-j)/(j+1);
                sum = sum1;

        }
        System.out.println();
    }
}
}
