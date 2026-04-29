class person{
     static class student{

    }
    static int count = 0;

    person(){
        count++;
    }
}
public class staticQ {
    public static void main(String[] args) {
        person p1 = new person();
        person p2 = new person(); 
        person p3 = new person();
        System.out.println(person.count);
    }
}
