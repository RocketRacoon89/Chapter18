import org.jetbrains.annotations.NotNull;

import java.util.*;

public class Test1 {
    public static void main(String[] args) {
        Z z = new Z();
        System.out.println(creathm(z.i));
    }

    static HashMap<Integer, Integer> creathm(Integer[] a) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        Integer c = 0;
        for(Integer i:a) {
            hm.put(c,i);
            c++;
        }
        return hm;
    }

    static ArrayList<Integer> creatal(Integer[] a) {
        ArrayList<Integer> al = new ArrayList<>();
        for(Integer i:a) {
            al.add(i);
        }
        return al;
    }

    static LinkedList<Integer> creatll(Integer[] a) {
        LinkedList<Integer> ll = new LinkedList<>();
        for(Integer i:a) {
            ll.add(i);
        }
        return ll;
    }

    static TreeSet<Integer> creatts(Integer[] a) {
        TreeSet<Integer> ts = new TreeSet<>();
        for(Integer i:a) {
            ts.add(i);
        }
        return ts;
    }

    static TreeMap<Integer, Integer> crattm(Integer[] a) {
        TreeMap<Integer, Integer> tm = new TreeMap<>();
        int c = 0;
        for(Integer i:a) {
            tm.put(c, i);
            c++;
        }
        return tm;
    }

    static HashSet<Integer> creaths(Integer[] a) {
        HashSet<Integer> hs = new HashSet<>();
        for(Integer i:a) {
            hs.add(i);
        }
        return hs;
    }

    static void searchdoub(HashMap<Integer,Integer> hmap, Integer v) {

    }

}

class Z{
    Integer [] i = {3,8,15,17};
}



