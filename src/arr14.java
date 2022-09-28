//print all zero at begin
public class arr14 {
    public static void main(String[] args) {
    int s[]={0,1,1,0,0,1,0,1,1};
    int left=0;
    int right=s.length-1;
    while(left<right){
        if(s[left]==0)
        {
            left++;
        } else if (s[right]==1) {
            right--;
        }
        else{
            s[left]=0;
            s[right]=1;
        }
    }
        for(int i=0;i<s.length;i++){
            System.out.println(s[i]);
        }
    }
}
