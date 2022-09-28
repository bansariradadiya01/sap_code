//compare and write mising element index
public class arr17 {
    public static void main(String[] args) {
        int a[]={1,2,3,4};
        int b[]={1,2,4};
        int x=a.length;
        int y=b.length;
        for (int i = 0; i < y; i++) {
            if(a[i]!=b[i]){
                System.out.println(i);
            }

        }



    }
}

