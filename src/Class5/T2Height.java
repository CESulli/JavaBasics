package Class5;

import java.util.Scanner;

public class T2Height {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter Your Height in Inches"); //prompt user

        int height=input.nextInt(); //to enter persons height in inches
        if (height<60) {
            System.out.println("Your height is short!");
        } else if (height>60 && height<72) {
            System.out.println("You are average height!");
        } else {
            System.out.println("Your height is tall!");
        }
    }
}
