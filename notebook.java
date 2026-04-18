class notebook1 {
    String name ;
    int roll;
    notebook1(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }
    // copy constructor
    notebook1(notebook1 obj) {
        this.name = obj.name;
        this.roll = obj.roll;

    }
}
public class notebook {
    public static void main(String[] args) {
        System.out.println("Copy constructor");
        notebook1 n1 = new notebook1 ("Ayush", 10343);
        notebook1 n2 = new notebook1(n1);
        System.out.println(n2.name);
        System.out.println(n2.roll);
    }
}
