public class person {

 private String name;
 private int age;
   void set(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void get() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Private {
    public static void main(String[] args) {
        person p = new person("Alice", 30);
    }
}
