public class StringHandlingDemo {
    public static void main(String[] args) {
        String s = "Hello";
        s = s + " World";
        System.out.println(s);

        StringBuffer b = new StringBuffer("Java");
        b.append(" Programming");
        b.insert(0, "Learning ");
        System.out.println(b);

        StringBuilder sb = new StringBuilder("Parul");
        sb.append(" University");
        sb.replace(0, 5, "PARUL");
        System.out.println(sb);
    }
}