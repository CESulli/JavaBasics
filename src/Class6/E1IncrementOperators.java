package Class6;

public class E1IncrementOperators {
    // variable++ / ++variable: this will always increase it by 1
    // variable++ will only make a difference if you are performing more than one operation on the same line
    // ++variable : increment first then print 100 increased to 101 then printed
    // variable++ : print first then increment :so 100 will print as 100 and forget the 1
    public static void main(String[] args) {
        int age = 100;
       // ++age;
        System.out.println(age++);
        System.out.println(age);
    }
}
