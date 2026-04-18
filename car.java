class Car1 {
    String brand;
    int speed;
    int price;
    void setproperties(String brand, int speed, int price) {
        this.brand = brand;
        this.speed = speed;
        this.price = price;
    }
        void display() {
            System.out.println(this.brand);
            System.out.println(this.speed);
            System.out.println(this.price);
        }
    }

public class car {
    public static void main() {
        Car1 c1 = new Car1();
        c1.setproperties("BMW", 200, 5000000);
        c1.display();
    }
    
}
