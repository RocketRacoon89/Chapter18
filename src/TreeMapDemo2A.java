//использовать метод thenComparing() для сортировчки счетов вкладчиков
//сначала по фамилии, а затем по имени

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

class CompLastNames implements Comparator<String> {
    public int compare(String aStr, String bStr) {
        int i, j;
        //найти индекс символа, с которого начинается фамилия
        i = aStr.lastIndexOf(' ');
        j = bStr.lastIndexOf(' ');
        return aStr.substring(i).compareToIgnoreCase(bStr.substring(j));
    }
}

//отсортировать счета вкладчиков по Ф.И.О.,
//если фамилии одинаковы
class CompThenByFirstName implements Comparator<String> {
    public int compare(String aStr, String bStr) {
        int i, j;
        return aStr.compareToIgnoreCase(bStr);
    }
}

public class TreeMapDemo2A {
    public static void main(String[] args) {
        //использовать метод thenComparing() для создания компаратора,
        //сравнивающего сначала фамилии, а затем ФИО вкладчиков, если фамилии одинаковы
        CompLastNames compLN = new CompLastNames();
        Comparator<String> compLastThenFirst = compLN.thenComparing(new CompThenByFirstName());

        //создать древовидное отображение
        TreeMap<String, Double> tm = new TreeMap<>(compLastThenFirst);

        //ввести элементны в древовидное отображение
        tm.put("Джон Доу", new Double(3434.34));
        tm.put("Том Смит", new Double(123.22));
        tm.put("Джейн Бейкер", new Double(1378.00));
        tm.put("Тод Холл", new Double(99.22));
        tm.put("Ральф Смит", new Double(-19.08));

        //получить множество элементов
        Set<Map.Entry<String, Double>> set = tm.entrySet();

        //вывести элементы из множества
        for(Map.Entry<String, Double> me : set) {
            System.out.print(me.getKey()+": ");
            System.out.println(me.getValue());
        }

        System.out.println();

        //внести сумму 1000 на счет Джона Доу
        double balance = tm.get("Джон Доу");
        tm.put("Джон Доу", balance+1000);
        System.out.println("Новый остаток на счете Джона Доу: "+tm.get("Джон Доу"));
    }
}
