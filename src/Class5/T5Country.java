package Class5;

import java.util.Scanner;

 //Ask user to enter their country and capture it. Once values are captured print which language user speaks.
public class T5Country {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Please Enter Your Country");

        String country=input.nextLine();

        switch (country) {
            case "USA":
                System.out.println("English");
            break;
            case "Peru":
                System.out.println("Spanish");
                break;
            case "Italy":
                    System.out.println("Italian");
                    break;
            case "Taiwan":
                        System.out.println("Mandarin");
                        break;
            default:
                System.out.println("Do Not Recognize Language");
        }
    }
}
