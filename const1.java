class Constructor {
    double cgpa;
    int backlogs;
    boolean isPassed;
    char grade;
    // parameterized constructor
    Constructor(double cg , int back , boolean isPassed , char grade) {
        System.out.println("parameterized Constructor is called");
        cgpa = cg;
        backlogs =back;
        this.isPassed = isPassed;
        this.grade = grade;
    }
    // value - object creataion ke time 
}
public class const1 {
    public static void main(String[] args) {
        Constructor c1 = new Constructor(8.5, 5, true, 'A');
        System.out.println(c1.cgpa);
        System.out.println(c1.backlogs);
        System.out.println(c1.isPassed);
        System.out.println(c1.grade);
    }
}
