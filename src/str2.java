//reverse
public class str2 {
    public static void main(String[] args) {
        String str="good morning";
        int len=str.length();
        char[] charArray=str.toCharArray();
        int l=0;
        int r=len-1;
        while (l < r) {
            char temp=charArray[l];
        charArray[l]=charArray[r];
        charArray[r]=temp;
        l++;
        r--;
        }
        String revString = new String(charArray);
        System.out.println(revString);
        }

    }

