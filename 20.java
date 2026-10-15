import java.util.*;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        q.add(30);
        q.add(10);
        q.add(20);

        while (!q.isEmpty())
            System.out.println(q.poll());

        Deque<String> d = new ArrayDeque<>();
        d.addFirst("Java");
        d.addLast("Python");
        d.addFirst("C++");

        System.out.println(d);
    }
}