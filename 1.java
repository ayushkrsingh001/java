Practical 1(a): Hello World
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}


Practical 1(b): Variables and Data Types
public class VariablesDemo {
    public static void main(String[] args) {
        int age = 19;
        double marks = 89.5;
        char grade = 'A';
        boolean result = true;
        String name = "Omkar";

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
        System.out.println("Result: " + result);
    }
}

Practical 1(c): Type Casting
public class TypeCastingDemo {
    public static void main(String[] args) {
        int a = 50;
        double b = a;
        double x = 99.99;
        int y = (int) x;

        System.out.println("Implicit: " + b);
        System.out.println("Explicit: " + y);
    }
}