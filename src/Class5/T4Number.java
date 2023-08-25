package Class5;

import java.util.Scanner;

public class T4Number {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter a Number");

        int number=input.nextInt();

        if (number>=1 && number<=10) {
            System.out.println("Small");
        } else if (number>=11 && number<=100) {
            System.out.println("Medium");
        } else if (number>=101 && number<=1000) {
            System.out.println("Large");
        }
    }
}
