public class classstudent {
        String name;
    int marks;
    double attendance;
    void setdata(String n, int m, double a) {
        name = n;
        marks = m;
          attendance = a;
    }
    void display() {
        System.out.println(name);
        System.out.println(marks);
        System.out.println(attendance);
    }
}