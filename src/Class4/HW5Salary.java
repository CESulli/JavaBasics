package Class4;

import java.util.Scanner;

public class HW5Salary {

    //Write a program to ask user to enter numbers of worked years and annual salary.
    // If user worked for more or equals to 5 years than user is eligible for the bonus, otherwise he is not.
    // Once user is eligible and salary is larger than 50000 than bonus = 5000, otherwise bonus=3000.

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("How many years have you worked?");
        int years=scanner.nextInt();
        if(years>=5) {
            System.out.println("Congrats on your bonus!");
            System.out.println("What is your annual salary?");
        }else{
            System.out.println("Your bonus will come with time!");
        }
        double salary=scanner.nextDouble();
        if(salary>50000){
            System.out.println("Your annual bonus is 5000!");
        }else{
            System.out.println("Your annual bonus is 3000!");
        }

    }





}
