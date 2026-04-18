public class methodsE {
    public static void greet(String name) {
        System.out.println("Hello, " + name);
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println("methods");
        greet("Alice");
        int result = add(5, 10);
        System.out.println("Result: " + result);
    }
}