import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Zadanie1v3 {

    public static void main(String[] args) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0, 3);
        hm.put(1, 8);
        hm.put(2, 15);
        hm.put(3, 17);
        hm.put(4, 11);
        hm.put(5, 14);
        hm.put(6, 6);
        hm.put(7, 4);
        hm.put(8, 5);
        hm.put(9, 2);
        hm.put(10, 1);
        hm.put(11, 21);
        hm.put(12, 7);
        poisk(hm, 8);

    }

    static void poisk(HashMap<Integer, Integer> map, Integer sum) {
        ArrayList<Integer> tal = new ArrayList<>();
        for(Map.Entry<Integer, Integer> i : map.entrySet()) {
            for(Map.Entry<Integer, Integer> j : map.entrySet()) {
                if(i.getKey()!=j.getKey() & i.getValue()+j.getValue()==sum & !tal.contains(i.getKey()) & !tal.contains(j.getKey())) {
                    tal.add(i.getKey());
                    tal.add(j.getKey());
                    System.out.println(i.getKey()+" and "+j.getKey());
                }
            }
        }
    }

}