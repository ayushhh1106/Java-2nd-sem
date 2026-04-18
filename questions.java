public class questions {
    public static void main(String[] args) {
       int sum  [][] = {
        {1,2,3},
        {4,5,6},
        {7,8,9}
       };
       int sum1 = 0;
       for (int r = 0;r<sum.length;r++){
        for (int c=0;c<sum[0].length;c++){
            sum1 = sum1 + sum[r][c];
        }
        System.out.println("Sum of all element: " + sum1);
    }
    
    }
}
