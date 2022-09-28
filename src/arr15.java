//merge to sorted array
public class arr15 {
    public static void main(String[] args) {
        int a[]={1,1,4,5};
        int  b[]={3,5};

        int alen = a.length;
        int blen = b.length;

        int[] res = new int[alen + blen];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < alen && j < blen) {
            if (a[i] < b[j]) {
                res[k] = a[i];
                i++;
            } else {
                res[k] = b[j];
                j++;
            }
            k++;}
        while (i < alen) {
            res[k] = a[i];
            i++;
            k++;
        }
        while (j < blen) {
            res[k] = b[j];
            j++;
            k++;
        }
        for (int l = 0; l < res.length; l++) {
            System.out.println(res[l]);


        }

        }
    }





