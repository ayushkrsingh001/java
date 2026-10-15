import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> h = new HashMap<>();
        h.put(1, "Java");
        h.put(2, "Python");
        h.put(3, "C++");
        System.out.println("HashMap: " + h);

        LinkedHashMap<Integer, String> l = new LinkedHashMap<>();
        l.put(1, "HTML");
        l.put(2, "CSS");
        l.put(3, "JavaScript");
        System.out.println("LinkedHashMap: " + l);
    }
}