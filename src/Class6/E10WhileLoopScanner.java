package Class6;

import java.util.Scanner;

public class E10WhileLoopScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter the Starting Point");

        int start = scanner.nextInt();
        System.out.println("Please Enter the Ending Point");
        int end = scanner.nextInt();
        System.out.println("Please Enter the Steps");
        int step = scanner.nextInt();
        while (start <= end) {
            System.out.print(start +" ");
            start += step;
        }

    }
}
