package Class9;
//print only even numbers from this array
public class T12DEvenArray {
    public static void main(String[] args) {

        int[][] numbers = {
                {10, 20, 30, 40},
                {15, 30, 45, 58},
                {16, 20, 33, 44}};

        for (int row = 0; row < numbers.length; row++) {
            for (int col = 0; col < numbers[row].length; col++) {  //numbers[row] => gives us the complete 1D Array
                if(numbers[row][col]%2==0) // prints the even numbers
                  // if(numbers[row][col]%2!=0) // prints the odd numbers
                System.out.print(numbers[row][col] + " ");  //this specifies the length of the Array
            }
            System.out.println();
        }
    }
}
