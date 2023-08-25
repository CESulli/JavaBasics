package Class7;
//Create an array of chars and store grades into it: A,B,C,D. Then print a grade B (use 2 different ways of creating an array).
public class HW2Grades {
    public static void main(String[] args) {
        char[] grades = {'A','B','C','D'};
        System.out.println(grades[1]);


        char[] grade=new char [4];
        grade[0]='A';
        grade[1]='B';
        grade[2]='C';
        grade[3]='D';
        System.out.println(grade[1]);

    }
}


