package Class5;

import java.util.Scanner;

public class T1BirthMonth {

    //Write a program for user to enter his/hers birth month. Based on the month define the season.
    // Example: if user is born in March, April, May → season =”Spring” if user is born in June, July, August → season =”Summer” etc …
    // At the end of the program we should see 1 output as “You were born is season __”.
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your birth month");

        String month=scanner.nextLine();
        if(month.equalsIgnoreCase("January")||month.equalsIgnoreCase("February")||month.equalsIgnoreCase("December")) {
            System.out.println("You were born in Winter");
        }
            if(     month.equalsIgnoreCase("March")||
                    month.equalsIgnoreCase("April")||
                    month.equalsIgnoreCase("May")
            ) {
                System.out.println("You were born in Spring");
            }
                if(month.equalsIgnoreCase("June")||month.equalsIgnoreCase("July")||month.equalsIgnoreCase("August")) {
                    System.out.println("You were born in Summer");
                }
                    if(month.equalsIgnoreCase("September")||month.equalsIgnoreCase("October")||month.equalsIgnoreCase("November")){
                        System.out.println("You were born in Fall");
                    }
    }
}
