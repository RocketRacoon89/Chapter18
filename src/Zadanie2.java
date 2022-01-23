public class Zadanie2 {
    public static void main(String[] args) {
        int[] a = {4, 6, 5, 6, 6, 8, 6};
        Zadanie2 z2 = new Zadanie2();
        z2.doub(a);
    }

    boolean doub(int[] o) {
        boolean res = false;
        int count = 1;
        int d = 0;
        for (int i = 0; i < o.length; i++) {
            System.out.println(i);
            for (int j = 0; j < o.length; j++) {
                if (i != j) {
                    if (o[i] == o[j]) {
                        count++;
                        d = o[i];
                        res = true;
                    }
                }

            }
            if(res) {break;}

        }

        if (res) {
            System.out.println("Число " + d + " повторяется " + count + " раз");
            return res;
        } else
            System.out.println("Совпадений нет");
        return res;
    }
}
