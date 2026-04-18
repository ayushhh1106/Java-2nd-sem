class overload {
    //2 marks avg
    int avg (double m1 , int m2){
        double sum =(m1 + m2);
        double ans = sum / 2;
        return (int)ans;
    }
    int avg (int m1 , int m2, int m3){
        int sum = m1 + m2 + m3;
        int ans = sum / 3;
        return ans;
}
}
public class overloading {
    public static void main (){
        System.out.println("Method overloading");
        // int var = avg(45, 67); 
        overload o1 = new overload();
        double var = o1.avg(4.5, 67);
        System.out.println(var);
        
       
    }
}
