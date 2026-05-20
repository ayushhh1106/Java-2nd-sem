class Encap {
     private int age;
     // setter method
    void setAge(int age){
      if(age > 0){
        this.age = age;
      } else {
        System.out.println("invalid age");
      }
    }
    // getter method
    void getAge(){
        System.out.println(age);
    }
}

public class encapsulation {
    public static void main(String[] args) {
        Encap e1 = new Encap();
        e1.setAge(21);
        e1.getAge();
        e1.setAge(15);
        e1.getAge();
    }
}
