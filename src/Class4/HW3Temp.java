package Class4;

import java.util.Scanner;

public class HW3Temp {

    //* Create a Java program that will ask user to input city and temperature.
    // Your program should convert Fahrenheit into celsius and print “The temperature is the city is ”

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Your City");

        String city=scanner.nextLine();
        System.out.println("Enter the Current Temperature");

        double fahrenheit=scanner.nextDouble();
        double celsius=(fahrenheit-32)*5/9;
        System.out.println(" The temperature in "+city+" is "+celsius);

    }
}
