
public class arr25 {

    public static void main(String[] args) {

        int arr[]={1,2,1,4,5};
        int sum=0;
        int sum1=0;
        for (int i = 0; i < arr.length; i++) {

                if(i%2==0){
                    sum=sum+arr[i];
                }
                else{
                    sum1=sum1+arr[i];
                }
        }

        System.out.println(Math.max(sum,sum1));
        
        }
    }
