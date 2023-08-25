package Class9;

public class E42DArrays {
    public static void main(String[] args) {

        int[][] numbers = {
                {10, 20, 30, 40},
                {15, 30, 45, 58},
                {16, 20, 33, 44}};

        for(int row=0; row < numbers.length; row++) {
            for (int col = 0; col < numbers[row].length; col++) {  //numbers[row] => gives us the complete 1D Array
                System.out.print(numbers[row][col] + " ");  //this specifies the length of the Array
            }
            System.out.println();
            //for (int row = 0; row < 3; row++) {
            // for (int col = 0; col < 4; col++) {
            //System.out.print(numbers[row][col]+" ");
            // }
            //System.out.println();
        }
    }
}