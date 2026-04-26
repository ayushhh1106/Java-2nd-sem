import java.util.Scanner;
public class string1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1.creation of string
        String s1 = "Hello ";
        String s2 = new String("World");
        System.out.println(s1);
        System.out.println(s2);
        // String comparison - return boolean value
        System.out.println(s1.equals(s2)); // true, because they have the same content
        //check admin login
        String username = "Ayush Sharma";
        String password = "Ayush1310";
        // Scanner sc = new Scanner(System.in); 
        // String user = sc.nextLine();
        // String pass = sc.nextLine();
        // if (username.equals(user) && password.equals(pass)) {
        //     System.out.println("welcome admin");
        // } else {
        //     System.out.println("invalid credentials");
        // }
        //methods of string
        System.out.println(s1.length()); // length of the string
         // convert to uppercase
        System.out.println(s1.toUpperCase());
        // convert to lowercase
        System.out.println(s1.toLowerCase()); 
        //concatenate two strings - add two strings together
        System.out.println(s1 + s2); // HelloHello
        System.out.println(s1.concat(s2)); // HelloHello 
        // 4. immutable string - cannot be changed once created
        String str = "Hello";
        str = "World"; // creates a new string object, str now points to "World"
        System.out.println(str); // World
        //print individual characters of a string
        String str1 = "Ayush Sharma"; //space is also a character (don't ignore space)
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < str1.length(); i++) {
            System.out.println(str1.charAt(i)); 
        }
        //mutable string 
        StringBuilder Strd = new StringBuilder("hello");
        // StringBuffer strf = new StringBuffer("Ayusshhhhhh");
        //methods 
        //append - add to the end of the string -returns the same object
        Strd.append(" Ayush");
        System.out.println(Strd); // hello Ayush
        //insert - add at a specific position
        Strd.insert(5, "ji ");
        System.out.println(Strd); // Hello hello Ayush
        // delete - remove a part of the string
        Strd.delete(2, 5); // delete characters from index 2 to 5
        System.out.println(Strd); // Heji hello Ayush
        // replace - replace a part of the string with another string
        Strd.replace(2,5, "yyyyyAyush"); // replace characters from index 2 to 5 with "yush"
        System.out.println(Strd); // Heyush hello Ayush
        // reverse - reverse the string 
        System.out.println(Strd.reverse()); // hsuyA olleh hsuyA
        // question. take input from user as a string and reverse it
        // convert to string builder and reverse it
        // then return your ans as a string
        String inp = "Ayush Sharma";
        StringBuilder sb1 = new StringBuilder(inp); //this is imp step
        sb1.reverse();
        String ans = sb1.toString();
        ans.toCharArray(); // convert string to char array
    }
}
