class car {
    String brand;
    int speed;
    int price;
    car(String brand, int speed, int price) {
        this.brand = brand;
        this.speed = speed;
        this.price = price;
    }
}
public class const2 {
    public static void main(String[] args) {
        car c1 = new car("BMW", 200, 5000000);
        System.out.println(c1.brand);
        System.out.println(c1.speed);
        System.out.println(c1.price);
    }
    
}
