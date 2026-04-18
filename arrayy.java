import java.util.Scanner;

public class arrayy {
    public static void main(String[] args) {
        int arr[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println(arr.length); // number of rows
        System.out.println(arr[0].length); // number of columns
        

        int fixed[][] = new int[3][3];

        Scanner sc = new Scanner(System.in);

        // Input in 2D array
        for (int r = 0; r < fixed.length; r++) {
            for (int c = 0; c < fixed[0].length; c++) {
                fixed[r][c] = sc.nextInt();
            }
        }

        // Output 2D array
        for (int r = 0; r < fixed.length; r++) {
            for (int c = 0; c < fixed[0].length; c++) {
                System.out.print(fixed[r][c] + " ");
            }
                System.out.println();
            }
            //jagged array
            int jagged[][]={
                {1,2,3},
                {3,4,5,4,5},
                {6,7,8,9}
            };
            for (int r = 0; r < jagged.length; r++) {
            for (int c = 0; c < jagged[r].length; c++) {
                System.out.print(jagged[r][c] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}