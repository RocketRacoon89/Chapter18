import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Zadanie1v2 {
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
        poisk(hm, 23);
    }

    static void poisk(HashMap<Integer, Integer> map, Integer summa) {
        Integer a = summa;
        Integer b = -1;
        Integer c = -1;

        while(summa>0) {
            summa--;
            if(map.containsValue(summa)&map.containsValue(a-summa)) {
                //System.out.println("Nashli "+summa+" "+a);
                for(Map.Entry<Integer, Integer> i : map.entrySet()) {
                    if(i.getValue()==summa) {
                        b=i.getKey();
                    }
                    if(i.getValue()==a-summa) {
                        c=i.getKey();
                    }
                }
                if(b==c) {continue;}
                else {
                    System.out.println(b+"  "+c);
                    break;
                }
            }
        }
    }
}
