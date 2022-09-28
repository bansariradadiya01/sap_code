public class str1 {
    public static void main(String[] args) {
        String s="hello";
        int start=3;
        int end=5;
        char [] str=new char[end-start];
        s.getChars(start,end,str,0);
//        System.out.println(str);
//        System.out.println(str.toUpperCase());
//        System.out.println(str.toLowerCase());
//        System.out.println(str.charAt(0));
//        System.out.println(str.concat(" world"));
//        System.out.println(str.indexOf('o'));
//        System.out.println(str.isEmpty());
//        System.out.println(str.length());
//        System.out.println(str.trim());
//        System.out.println(str.equalsIgnoreCase("HELLO"));
//        System.out.println(str.replace('h','H'));
        System.out.println(s.toCharArray());
        System.out.println(str );
    }
}
