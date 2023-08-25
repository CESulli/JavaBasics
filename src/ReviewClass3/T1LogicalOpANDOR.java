package ReviewClass3;

import java.util.Scanner;

//Ask the user to input two boolean values (true or false).
//Use the logical AND operator (&&) to determine if both are true.
//Display the result to the user.
public class T1LogicalOpANDOR {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Do you like tea");
        boolean tea=scanner.nextBoolean();
        System.out.println("Do you like it with milk?");
        boolean milk=scanner.nextBoolean();

        if(tea&&milk){
            System.out.println("I like my tea with milk");
        } else {
            System.out.println("I like my tea without milk");
        }
    }
}
