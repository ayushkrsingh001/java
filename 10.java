public class Student {
    String name;
    int rollNo;
    double marks;

    Student() {
        name = "Unknown";
        rollNo = 0;
        marks = 0;
    }

    Student(String n, int r, double m) {
        name = n;
        rollNo = r;
        marks = m;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Omkar", 11, 88.5);

        s1.display();
        s2.display();
    }
}