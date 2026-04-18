class circle {
    double radius;
    circle(double radius) {
        this.radius = radius;
}
//method to calculate area of circle
void callarea() {
    System.out.println(3.14 * radius * radius);
}
}
public class question {
    public static void main(String[] args) {
        circle c1 = new circle(5.0);
        c1.callarea();
}
}
