import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        //создать древовидное отображение

        TreeMap<String, Double> tm = new TreeMap<>();
        tm.put("Джон Доу", new Double(3434.34));
        tm.put("Том Смит", new Double(123.22));
        tm.put("Джейн Бейкер", new Double(1378.00));
        tm.put("Тод Холл", new Double(99.22));
        tm.put("Ральф Смит", new Double(-19.08));

        //получить множество записей
        Set<Map.Entry<String, Double>> set = tm.entrySet();

        //вывести множество записей
        for(Map.Entry<String, Double> me : set) {
            System.out.println(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();

        //внести сумму 1000 на счет Джона Доу
        double balance = tm.get("Джон Доу");
        tm.put("Джон Доу", balance + 1000);
        System.out.println("Новый остаток на счете Джона Доу: " +tm.get("Джон Доу"));
    }
}
