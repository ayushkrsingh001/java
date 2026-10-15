4(a) Reverse of a Number — While Loop
public class ReverseNumber {
    public static void main(String[] args) {
        int n = 12345, rev = 0;

        while (n > 0) {
            rev = rev * 10 + n % 10;
            n = n / 10;
        }

        System.out.println("Reverse: " + rev);
    }
}


4(b) Prime Number — Do-While Loop
public class PrimeCheck {
    public static void main(String[] args) {
        int n = 29, i = 2;
        boolean prime = true;

        do {
            if (n % i == 0) {
                prime = false;
                break;
            }
            i++;
        } while (i <= n / 2);

        if (n < 2)
            prime = false;

        System.out.println(prime ? "Prime" : "Not Prime");
    }
}


4(c) Nth Fibonacci Term — For Loop
public class FibonacciTerm {
    public static void main(String[] args) {
        int n = 10, a = 0, b = 1;

        for (int i = 1; i < n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }

        System.out.println(n + "th term: " + a);
    }
}