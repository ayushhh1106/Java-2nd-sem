import java.util.Arrays;
public class ReverseArray {
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5};
        // reverse the array
        // 1.ek saath 2 jagah pe present 0 and last index pe present element ko swap karna hai
        // 2.0 - start; n-1 - end; start<end; start++; end--;
        // 3.swap(Start,end);
        // 4.start ++; end --;
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            //swap
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
        
    }
}
