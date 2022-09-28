import java.util.*;
public class pep1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt();
        int m = sc.nextInt();
        if(n==m){
            System.out.println("both are equal");

        } else if (n>m) {
            System.out.println("n is greater than m");

        }
        else System.out.println("m is greater than n");
    }
}
