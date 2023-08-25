package Class4;

import java.util.Scanner;

public class HW2DMVRep {

    //* You are DMV representative and you need to ask customer their age.
    // If they are 18 and older you will issue a driver license to them, otherwise you will offer them to get a learners permit.

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("What is your age?");

        int age=scanner.nextInt();
        if (age>=18){
            System.out.println("You have been issued a driver's license!");
        }else{
            System.out.println("You have been issued a learner's permit!");
        }


    }
}
