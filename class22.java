class Student {
    String name;
    int marks;
    double attendance;

    void setData(String name, int marks, double attendance) {
        this.name = name;
        this.marks = marks;
        this.attendance = attendance;
    }

    void display() {
        System.out.println(this.name);
        System.out.println(this.marks);
        System.out.println(this.attendance);
    }
}

public class class22 {
    public static void main() {
        Student s1 = new Student();
        s1.setData("name", 45, 87.2);
        s1.display();
    
    Student s2 = new Student();
    s2.setData("Ayush", 100, 80.0);
    s2.display();
    }
}