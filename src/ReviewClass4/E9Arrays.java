package ReviewClass4;
//how to combine scanner, arrays, & loops
import java.util.Arrays;
import java.util.Scanner;

public class E9Arrays {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the size of the array");
        int size=scanner.nextInt();
        int [] numbers=new int[size]; //creates an array of the size of int from user input

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Please enter the number");
            numbers[i]=scanner.nextInt(); //this loop will help us fill the array with actual numbers
        }
        System.out.println("You entered these numbers");
        System.out.println(Arrays.toString(numbers));  //prints all elements of array on one line without writing a loop
    }
}
