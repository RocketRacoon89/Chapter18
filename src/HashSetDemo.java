import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();

        hs.add("Бета");
        hs.add("Альфа");
        hs.add("Гама");
        hs.add("Эта");
        hs.add("Эпсилон");
        hs.add("Омега");

        System.out.println(hs);
    }
}
