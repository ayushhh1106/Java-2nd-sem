class Student {
    // data members or properties
    String name;
    int age;
    int attendence;
    // methods or actions
    void study (){
        System.out.println("Ayush padh rha h ");
    }
    void sleep (){
        System.out.println("Ayush so rha h");
    }
    void games (){
        System.out.println("online games khel rha h");//it is non static method called by object and its written in the class
    }
    void display (){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Attendance: " + attendence);
    }
    
}
public class class1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "ayush";
        s1.age = 20;
        s1.attendence = 10343;
        System.out.println("Name: " + s1.name);
        System.out.println("Age: " + s1.age);
        System.out.println("Attendance: " + s1.attendence);
        s1.study ();//method call
        s1.sleep ();
        s1.games();

    }
}
//non static method ko call krne k liye object bnana pdta h
//call=>object.method()
//static method ko call krne k liye object bnane ki jarurat nhi hoti h
//call=>class.method()