public class foreachloop {
    public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5};
    for (int ayush : arr) {
        System.out.println(ayush);
    }
    double[] arr1 = {1.5, 2.5, 3.5, 4.5, 5.5};
    for (double ayush1 : arr1) {
        System.out.println(ayush1);
    }
    String[] arr2 = {"Ayush", "Rohit", "Satyarth", "Shivam"};
    for (String ayush2 : arr2) {
        System.out.println(ayush2);
    }
    for(int r=1; r<=5; r++){
        for(int c=1; c<=r; c++){
            System.out.print("* ");
        }
        System.out.println();
    }
}
}
  