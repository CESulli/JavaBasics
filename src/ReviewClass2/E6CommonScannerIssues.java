package ReviewClass2;

import java.util.Scanner;

public class E6CommonScannerIssues {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        //nextLine allows you to put two names
        //String city=scanner.next();
        //System.out.println("Enter the Current Temperature");
        //vs
        //String city=scanner.nextLine();
        //System.out.println("Enter the Current Temperature");
        //

        System.out.println("Enter your FullName");
        String fName=scanner.nextLine();
        //vs String fName=scanner.next():
        //scanner.nextLine();
        System.out.println("Please Enter your City");
        String city= scanner.nextLine();
        System.out.println(fName+" "+city);
        //placing just scanner.next and not scanner.nextLine runs the code past the second String City
        //it always goes and checks if something is present in the buffer, the next method will try to consume the next word.
        //keep buffering in mind! either use nextLine for both or next method, write an extra scanner.nextLine(); inbetween



    }
}
