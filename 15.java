public class Main {
    static abstract class Shape {
        abstract void area();

        void display() {
            System.out.println("This is a shape");
        }
    }

    interface Printable {
        void print();
    }

    interface Showable {
        void show();
    }

    static class Circle extends Shape implements Printable, Showable {
        void area() {
            double r = 5;
            System.out.println("Area: " + (3.14 * r * r));
        }

        public void print() {
            System.out.println("Printing Circle");
        }

        public void show() {
            System.out.println("Showing Circle");
        }
    }

    public static void main(String[] args) {
        Circle c = new Circle();
        c.display();
        c.area();
        c.print();
        c.show();
    }
}