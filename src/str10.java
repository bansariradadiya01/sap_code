//remove vowels
public class str10 {
    public static void main(String[] args) {
        String str = "good morning";
//        String  strRes, vowels;
//        char ch;
//        int i, count, k;
//
//        strRes="";
//        vowels = "aeiouAEIOU";
//        for(i=0; i<str.length(); i++)
//        {
//            count=0;
//            ch = str.charAt(i);
//            for(k=0; k<vowels.length(); k++)
//            {
//                if(ch==vowels.charAt(k))
//                    count++;
//            }
//            if(count==0)
//                strRes = strRes + ch;
//        }
//
//        System.out.println("\nString without Vowels = " +strRes);
    String str2=" ";
     str2= str.replaceAll("[aeiou]","");
        System.out.println( str2);
    }
}

