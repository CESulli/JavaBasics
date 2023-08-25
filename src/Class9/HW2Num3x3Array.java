package Class9;

/*
Create a 2D array or integer type and store numbers in 3 rows and 3 columns. Print the sum of all numbers.
 */
public class HW2Num3x3Array {
    public static void main(String[] args) {
        int[][] numbers={
                {14,24,34},
                {44,54,64},
                {74,84,94}};

        int sum = 0;
        for (int row = 0; row < numbers.length; row++) {
            for (int col = 0; col < numbers[row].length; col++) {
                sum = sum + numbers[row][col];
            }
        }
        System.out.println(sum);
    }
}
