import java.lang.Math;
import java.util.Scanner;

public class Mathlibrary {
    public static void main(String [] args){
        System.out.println("math library");
        // absolute - -ve to +ve
        int abs = Math.abs(-98);
        System.out.println(abs);
        //square root
        int sqrt = (int) Math.sqrt(64);
        System.out.println(sqrt);
        //power / exponent -pow(a,b) a^b
        double pow = Math.pow(3,3);
        System.out.println(pow);
        //min and max
        int min = Math.min(10, 20);
        int max = Math.max(10, 20);
        System.out.println(min);
        System.out.println(max);
        //round of ;
        // round - 0.5 or greater - next number;
        // - less than 0.5 - prevoius
        //floor and ceil
        System.out.println(Math.round(3.7)); //estimation agr 0.5 ya usse jyada hai to next number print karega otherwise previous number print karega
        System.out.println(Math.round(3.7));// ceil - next number print karega chahe 0.1 ho ya 0.9

        System.out.println(Math.ceil(3.7));// floor - previous number print karega chahe 3.1 ho ya 3.9
        System.out.println(Math.floor(3.7));
    }
}
