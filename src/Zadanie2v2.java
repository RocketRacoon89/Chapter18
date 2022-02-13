import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class Zadanie2v2 {

    public static void main(String[] args) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0, 2);
        hm.put(1, 8);
        hm.put(2, 22);
        hm.put(3, 17);
        hm.put(4, 3);
        hm.put(5, 14);
        hm.put(6, 2);
        hm.put(7, 23);
        hm.put(8, 2222);
        hm.put(9, 10);
        hm.put(10, 2);
        hm.put(11, 2);
        poisk(hm);
    }

    static void poisk(HashMap<Integer, Integer> map) {
        int count=0;
        Integer a=-1;
        for(Map.Entry<Integer, Integer> i : map.entrySet()) {
            count=1;
            for(Map.Entry<Integer, Integer> j : map.entrySet()) {
                if(i.getKey()!=j.getKey() & i.getValue()==j.getValue()) {
                    count++;
                    a=i.getValue();
                }
            }
            if(count>1) {System.out.println("Chislo "+a+" povtoryaetsya "+count+" raz."); break;}
            count=0;
        }	if(count==0) {System.out.println("Sovpadeniy net");}
    }
}