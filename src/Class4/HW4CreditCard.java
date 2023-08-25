package Class4;

import java.util.Scanner;

public class HW4CreditCard {

    //* Create a Java program that will ask if user has a credit card or not. If you user does not have a credit card then offer them.
    // If they do have one ask what is balance on the card?
    // If balance of the card is larger than 1000, tell them to pay off immediately, otherwise you can tell them that they can spend more.

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Do you have a Credit Card? Yes or No?");
        String answer=scanner.next();

        if(answer.equals("No")){
            System.out.println("Would you like to apply?");

        }else if(answer.equals("Yes")){
            System.out.println("What is your current balance?");
        }
        long balance=scanner.nextLong();

        if(balance>1000){
            System.out.println("You must pay your balance in full immediately.");
        }else{
            System.out.println("You have available spending credit!");
        }



    }

}
