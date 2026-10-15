Practical 3(a): Even or Odd
public class EvenOdd {
    public static void main(String[] args) {
        int n = 17;

        if (n % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}


Practical 3(b): Roots of Quadratic Equation
public class QuadraticRoots {
    public static void main(String[] args) {
        double a = 1, b = -5, c = 6;
        double d = b * b - 4 * a * c;

        if (d > 0) {
            System.out.println((-b + Math.sqrt(d)) / (2 * a));
            System.out.println((-b - Math.sqrt(d)) / (2 * a));
        } else if (d == 0) {
            System.out.println(-b / (2 * a));
        } else {
            System.out.println("Imaginary roots");
        }
    }
}


Practical 3(c): Largest of Three Numbers
public class LargestOfThree {
    public static void main(String[] args) {
        int a = 25, b = 42, c = 38;

        if (a > b && a > c)
            System.out.println(a);
        else if (b > c)
            System.out.println(b);
        else
            System.out.println(c);
    }
}




Practical 3(d): Weekday Using Switch
public class WeekDay {
    public static void main(String[] args) {
        int day = 4;

        switch (day) {
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            case 4: System.out.println("Thursday"); break;
            case 5: System.out.println("Friday"); break;
            case 6: System.out.println("Saturday"); break;
            case 7: System.out.println("Sunday"); break;
            default: System.out.println("Invalid day");
        }
    }
}