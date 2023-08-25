package Class9;
/*
Create a 2D array or integer type where you will store odd and even numbers in 3 rows and 4 columns.
Develop a program which will identify/print the even numbers only.
 */
public class HW3Even3x4Array {
    public static void main(String[] args) {
        int[][] numbers={
                {14,25,34,45},
                {15,24,35,44},
                {54,65,74,84}};

        for (int row = 0; row < numbers.length; row++) {
            for (int col = 0; col < numbers[row].length; col++) {
                if(numbers[row][col]%2==0)
                    System.out.print(numbers[row][col] + " ");
            }
            System.out.println();
        }
    }
}
