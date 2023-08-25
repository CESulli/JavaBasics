package Class7;

public class E1NestedLoops {
    public static void main(String[] args) {

        for(int i=0;i<5;i++){
            System.out.print("+");
        }
        System.out.println();
        for (int i=0;i<5;i++){
            System.out.print("+");
        }
        System.out.println();
        for (int i=0;i<5;i++) {
            System.out.print("+");
        }
        for (int i=0; i<3; i++) {

        }
    }
}
/* VS
 for (int j=0;j<7; j++) {      // how many rows of plus signs
   for (int i=0;i<5;i++){      // how many plus signs in each row
       System.out.print("+");  // inner loop print
       }
       System.out.print();     // outer loop print
       }
*/
