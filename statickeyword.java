class Student{
    int erpNo;
    static String collegeName = "RISU"; // static variable
    //static keyword -created once shared among all objects of the class, can be accessed without creating an instance of the class
    static void print(){
        System.out.println(collegeName);
        // cannot use non-static variable inside a static method
        // a static methood but can use a static variable inside a static method
    }
}
public class statickeyword {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.erpNo = 10343;
        System.out.println(s1.collegeName); // accessing static variable through object reference

        Student s2 = new Student();
        s2.erpNo =10341;
        System.out.println(s2.collegeName); 

        Student.print();
        
    }
    static{
        System.out.println("Static block");
        // it runs start even before main method and it runs only once when the class is loaded into memory
    }    
}
