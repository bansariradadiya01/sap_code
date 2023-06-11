public class arr10 {
    public static void main(String[] args) {
        int a1[] = {1, 2,3, 5,5,5};

        for(int i=0;i<a1.length;i++){
            for(int j=i+1;j<a1.length;j++){
                if(a1[i]==a1[j]){
                    System.out.println(a1[i]);
                    a1[j]=-1;
                }
            }
        }
    }
}