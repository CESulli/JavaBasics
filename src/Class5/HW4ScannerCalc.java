package Class5;

import java.util.Scanner;

//Using scanner class create calculator. Allow user to enter 2 numbers and operator(+,-,*,/). Based on operator provide the result to user.
//Please complete this assignment in 2 ways: using if statement and switch case.
public class HW4ScannerCalc {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please Enter Two Numbers");
        int num1=input.nextInt();
        int num2=input.nextInt();
        System.out.println("Please Enter the Operator");
        char operator=input.next().charAt(0);

        if (operator =='+'){
            System.out.println(num1+num2);
        }else if (operator=='-'){
            System.out.println(num1-num2);
        }else if (operator=='*'){
            System.out.println(num1*num2);
        }else if (operator=='/'){
            System.out.println(num1/num2);
        }else if (operator=='%') {
            System.out.println(num1 % num2);
        }else {
            System.out.println("Cannot Compute");
        }



    }

}
