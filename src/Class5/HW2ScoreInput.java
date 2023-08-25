package Class5;

import java.util.Scanner;

//Write a program that will read three inputs of scores (quiz, mid term, and final scores) and determine the grade based on the following rules:
//if the average score >=90 → grade=A
//if the average score >= 70 and <90 → grade=B
//if the average score>=50 and <70 → grade=C
//if the average score<50 → grade=F
public class HW2ScoreInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What was your score?");
        int score = scanner.nextInt();

        if (score >= 90) {
            System.out.println("Your Grade is an A");
        } else if (score >= 70 && score < 90) {
            System.out.println("Your Grade is a B");
        } else if (score >= 50 && score <70) {
            System.out.println("Your Grade is a C");
        } else if (score < 50) {
            System.out.println("Your Grade is an F");


        }
    }
}