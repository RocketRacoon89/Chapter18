import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;

public class Test {
    public static void main (String [] args) {
        HashMap<Integer, Integer> m = new HashMap<>();
        m.put(0, 3);
        m.put(1, 8);
        m.put(2, 15);
        m.put(3, 17);
        System.out.println(m.values());
        Set<Map.Entry<Integer, Integer>> me = m.entrySet();
        for(Map.Entry<Integer, Integer> i : me) {
            System.out.print(i.getValue()+", ");
        }
/*        Set<Map.Entry<Integer, Integer>> s = m.entrySet();
        for(Map.Entry<Integer, Integer>)*/

}
}