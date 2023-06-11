//prime or not
import java.util.*;
public class pep2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int m = sc.nextInt();
            int count = 0;
            for(int j = 0;j<m;j++){
                if(m%j==0){
                    count++;
                }
            }
            if(count==2){
                System.out.println(("prime"));
            }
            else{
                System.out.println("not prime");
            }
        }
    }
}
