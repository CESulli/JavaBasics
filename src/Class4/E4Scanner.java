package Class4;

import java.util.Scanner;

public class E4Scanner {
    public static void main(String[] args) {

        System.out.println("Please enter your name");
        Scanner input=new Scanner(System.in);
        String name = input.next();
       // System.out.println("Hello "+name);
        if(name.equals("Clare")) {
            System.out.println("Java student");
        }else{
            System.out.println("I don't know you");
        }




    }
}
