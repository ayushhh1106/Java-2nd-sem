import java.util.Scanner;
public class string1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1.creation of string
        String str1 = "Hello";
        String str2 = new String("Hello");
        System.out.println(str1);
        System.out.println(str2);
        // String comparison - return boolean value
        System.out.println(str1.equals(str2)); // true, because they have the same content
        //check admin login
        String username = "admin";
        String password = "Ayush123";
        Scanner sc = new Scanner(System.in);
        String user = sc.nextLine();
        String pass = sc.nextLine();
        if (username.equals(user) && password.equals(pass)) {
            System.out.println("welcome admin");
        } else {
            System.out.println("invalid credentials");
        }
    }
}