package Class5;

import java.util.Scanner;

//Allow user to enter grade (A, B, or C etc...) and then provide explanation:
// A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable.
// At the end your program should print which grade was entered by a user with explanation.
public class HW3Grade {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter Your Grade");
        char grade=scanner.next().charAt(0);

        if (grade=='A') {
            System.out.println("A-Excellent");
        } else if (grade=='B') {
            System.out.println("B-Good");
        } else if (grade=='C') {
            System.out.println("C-Average");
        } else if (grade=='D') {
            System.out.println("D-Bad");
        }else {
            System.out.println("Not Acceptable");
        }
    }
}

