import java.util.*;
public class variables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Ayush sharma, " + name);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println(sum);
        int diff = b - a;
       System.out.println(diff);
       int mul = a * b;
       System.out.println(mul);
         int ans = a*b/a-b;
         System.out.println(ans);
         int ans2 = (a*b)/(a-b);
         System.out.println(ans2);
    }
}
