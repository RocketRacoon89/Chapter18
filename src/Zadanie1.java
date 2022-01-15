import java.util.Arrays;

public class Zadanie1 {
    public static void main(String[] args) {
        int [] array = {3, 8, 15, 17};
        //int k = Arrays.binarySearch(array, 15);
        //System.out.println(k);
        Zadanie1 z = new Zadanie1();
        System.out.println(z.getind(array, 23));
    }

    int [] getind(int [] a, int sum) {
        if(a.length>0) {
            for (int i=0; i<a.length; i++) {
                for (int y=0; y<a.length; y++) {
                    if(i!=y) {
                        int res = a[i] + a[y];
                        if (res==sum) {
                            int [] ret = {i, y};
                            return ret;
                        };
                        int [] ret = {0};
                        return ret;
                    }
                }
            }

        }
        int [] ret = {0};
        return ret;
    }

}
