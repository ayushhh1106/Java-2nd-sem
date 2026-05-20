class person{
    //  static class student{
    // to create a static class we need a nested claas
    // where the inner class can only be static
    // }
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
