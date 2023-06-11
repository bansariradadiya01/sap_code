public class strlc9 {
    public static void main(String[] args) {
        String s []={"a","abc","bc","d"};
        String word="abc";
        int count=0;
        for (String i:s) {
            if(word.contains(i))
                count++;
        }
        System.out.println(count);

    }
}
