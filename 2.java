public class OperatorsDemo {
    public static void main(String[] args) {
        int a = 15, b = 4;
        boolean x = true, y = false;

        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a < b);

        System.out.println(x && y);
        System.out.println(x || y);
        System.out.println(!x);

        System.out.println(a & b);
        System.out.println(a | b);
        System.out.println(a ^ b);
        System.out.println(a << 2);
        System.out.println(a >> 2);
    }
}