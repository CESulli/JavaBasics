package Class9;
//Create a 2D Array (shorter way) in which first array will consist of4 names and second array will contain grades.
//Then your program should print name of the students that have an A + B Grade.
public class T32DArrays {
    public static void main(String[] args) {
     String[][] students={{"Ayesha","Giulia","John","Deepali"},
                          {"A","D","C","B"}};

        for (int i = 0; i < 4; i++) {
            if(students[1][i].equals("A")||students[1][i].equals("B"))
            System.out.println(students[0][i]); //prints all the grades or names depending on row #
        }
    }
}

