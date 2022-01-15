import java.util.ArrayList;

public class ArrayListToArray {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();

        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);

        System.out.println("Содержимое списочного массива al: "+ al);

        //Integer ia[] = new Integer[al.size()];
        //ia = al.toArray(ia);
        Integer ia[] = al.toArray(new Integer[0]);

        int sum = 0;

        for(int a:ia) {
            sum += a;
        }
        System.out.println(sum);

    }
}
