package Class5;

import java.util.Scanner;

public class HW4ScannerCalcSwitch {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please Enter Two Numbers");

        int num1=input.nextInt();
        int num2=input.nextInt();
        System.out.println("Please Enter the Operator");
        char operator=input.next().charAt(0);

        switch(operator){
            case '+':
                System.out.println(num1+num2);
                break;
            case '-':
                System.out.println(num1-num2);
                break;
            case '*':
                System.out.println(num1*num2);
                break;
            case '/':
                System.out.println(num1/num2);
                break;
            case '%':
                System.out.println(num1%num2);
                break;
            default:
                System.out.println("Cannot Compute");

        }
    }
}
