import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        // size not fixed
        int arr[] = {1, 2, 3, 4, 5};
        for (int i = 0;i<=4;i++){
            System.out.println(arr[i]);
        }
        //size fixed
        int arr1[] = new int[5];
        arr1[0] = 10;
        arr1[1] = 20;
        arr1[2] = 30;
        arr1[3] = 40;
        arr1[4] = 50;
        for (int i = 0;i<=4;i++){
            System.out.println(arr1[i]);
        }
        double arr2[] = new double[5];
        arr2[0] =10.5;
        arr2[1] =20.5;
        arr2[2] =30.5;
        arr2[3] =40.5;
        arr2[4] =50.5;
        for (int i = 0;i<=4;i++){
            System.out.println(arr2[i]);
        }
        Scanner sc  = new Scanner(System.in);
        int nums[] = new int[8];
        //input elements in array
        for (int i = 0;i<nums.length;i++){
            nums[i] = sc.nextInt();
        }
        //output elements in array
        for (int i = 0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
        for (int elements: nums){
            System.out.println(elements);
        }
        //datatype arrname[] = new datatype[size];
    }
}
