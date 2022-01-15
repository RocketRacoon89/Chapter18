import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        array.add(3);
        array.add(4);
        array.add(6);
        array.add(5);
        array.add(1);
        array.add(2);
        array.add(8);
        array.add(9);
        array.add(7);
        Test1 t1 = new Test1();
        System.out.println(t1.getRes(array, 16));
    }

    int getRes(ArrayList<Integer> ar, int q) {
        int sum;
        for (int i=0; i<ar.size(); i++) {
            for (int a=0; a<ar.size(); a++) {
                if(ar.get(i) != ar.get(a)) {
                    sum = ar.get(i) + ar.get(a);
                    if (sum == q) {
                        System.out.println("First " + ar.get(i) + " Second " + ar.get(a));
                        return sum;
                    }
                }
            }

        }
            return 1;
    }
}


