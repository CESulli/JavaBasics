package Class5;

import java.util.Scanner;

public class E2NotOperatorScanner {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please Enter Your Country's Name");

        String country=input.nextLine();
        if(!country.equals("Iran")){
            System.out.println("Welcome you are allowed");
        }
        if (country.equalsIgnoreCase("Iran")){
            System.out.println("You are not allowed");
        }

    }
}
