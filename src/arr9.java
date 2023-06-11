public class arr9 {
    public static void main(String[] args) {
        int arr[]={1,2,52,6,5,9,7,2};
        int count=0;
        int value=8;
        for(int i=0;i<arr.length;i++) {
            if (arr[i] == value) {
                if (count == 1) {
                    System.out.println("not unique element");
                    return;}
                count++;

            } }
        System.out.println("unique element");

    }
}
