class Student {
    String name;
    int rollNo;

    // constructor
    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    // method must be inside class
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
    }
}

public class Array4 {
    public static void main(String[] args) {
        // array of objects
        Student[] arr = new Student[3];

        arr[0] = new Student("Ayushhhhh", 10343);
        arr[1] = new Student("aryan", 292);
        arr[2] = new Student("ashish", 1234);

        for (Student var : arr) {
            var.display();
            System.out.println();
        }
    }
}