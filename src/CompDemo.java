import java.util.Comparator;
import java.util.TreeSet;

//компаратор для сравнения символьных строк в обратном порядке
class MyComp implements Comparator<String> {
    public int compare(String a, String b) {
        String aStr, bStr;
        aStr = a;
        bStr = b;

        //выолнить сравнение в обратное порядке
        return bStr.compareTo(aStr);
        //return aStr.compareTo(bStr);
    }
    //переопределять метод equals() не требуется
}

public class CompDemo {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>(new MyComp());
        //ввести элементы в древовидное множество
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");

        //вывести элементы из древовидного множества
        for(String element : ts)
            System.out.print(element + " ");
        System.out.println();
    }
}
