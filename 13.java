public class Main {
    static class Parent {
        int number = 50;

        void display() {
            System.out.println("Parent class method");
        }
    }

    static class Child extends Parent {
        int number = 100;

        void show() {
            System.out.println("This: " + this.number);
            System.out.println("Super: " + super.number);
            super.display();
        }
    }

    public static void main(String[] args) {
        Child c = new Child();
        c.show();
    }
}