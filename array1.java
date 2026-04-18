public class array1 {
    public static void main(String[] args) {
        int marks[][] = new int[3][3];
        marks[0][0] = 1;
        marks[0][1] = 2;
        marks[0][2] = 3;
        marks[1][0] = 4;
        marks[1][1] = 5;
        marks[1][2] = 6;
        marks[2][0] = 7;
        marks[2][1] = 8;
        marks[2][2] = 9;

        for (int r=0;r<marks.length;r++){
            for (int c=0;c<marks[0].length;c++){
                System.out.print(marks[r][c]+ " ");
            }
            System.out.println();
        }
        //reverse printing array
        int arr [][] = {{1,2,3},{4,5,6},{7,8,9}};
        for (int r=arr.length-1;r>=0;r--){
            for (int c=arr[0].length-1;c>=0;c--){
                System.out.print(arr[r][c]+ " ");
            }
            System.out.println();
        }
    }
}
