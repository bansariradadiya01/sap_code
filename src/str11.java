//reverse string of each word
public class str11 {
    public static void main(String[] args) {
        String str="good morning";
//       String [] words=str.split(" ");
//       String revs="";
//
//        for (int i = 0; i < words.length; i++) {
//            String word=words[i];
//            String revw="";
//
//            for (int j = word.length()-1; j >=0; j--) {
//                revw=revw+word.charAt(j);
//
//            }
//            revs=revs+revw+" ";
//        }
//        System.out.println(revs);
        String [] words=str.split(" ");
        String revs="";
        for (int i = 0; i < words.length; i++) {
            String word=words[i];
            String revw="";
            for (int j = word.length()-1; j >=0 ; j--) {
                revw=revw+word.charAt(j);
            }revs=revs+revw+" ";
        }
        System.out.println(revs);
    }

    }

