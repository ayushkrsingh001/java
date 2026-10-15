import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> h = new HashSet<>();
        h.add(30);
        h.add(10);
        h.add(20);
        h.add(10);
        System.out.println("HashSet: " + h);

        TreeSet<Integer> t = new TreeSet<>();
        t.add(30);
        t.add(10);
        t.add(20);
        t.add(10);
        System.out.println("TreeSet: " + t);
    }
}