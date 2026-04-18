import java.util.Arrays;
public class array3 {
   public static void printArray(double Ayush[]){
    Ayush[0] = 100022222.511222;
    // Arrays as mutable - change in method will reflect in original array
       for (double ele : Ayush){
           System.out.println(ele);
       }
    }
    public static void main(String[] args){
        //methods in array class
        // sort method
        int arr[] = {5,4,3,2,1};
        Arrays.sort(arr);
        for (int ele : arr){
            System.out.println(ele);
        }
        //fill method
        int arr1[] = new int[5];
        Arrays.fill(arr1, 10);
        for (int ele : arr1){
            System.out.println(ele);
    }
    // to string method
    int arr2[] = {1,2,3,4,5};
    String str = Arrays.toString(arr2);
    System.out.println(str);
    // copy of array
    int arr3[]  = Arrays.copyOf (arr2, arr2.length);
    for (int ele : arr3){
        System.out.println(ele);
    }
    //equals method
    if (Arrays.equals(arr2,arr3)){
        System.out.println("same");
    }
    // passing array to method
    int arr4[] ={1,2,3,4,5};
    double arr5[] = {1.1,2.2,3.3,4.4,5.5};
    printArray(arr5);
}
}
