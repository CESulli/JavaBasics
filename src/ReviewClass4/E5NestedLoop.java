package ReviewClass4;
/*
*
**
***
****
***
**
*
 */
public class E5NestedLoop {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int j = 1; j <= 3; j++) {
            for (int i = 0; i < 4 - j; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/*
        System.out.println();
        for (int i = 0; i < 1; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int i = 0; i < 2; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int i = 0; i < 3; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int i = 0; i < 4; i++) {
            System.out.print("*");
       }
    }for (int i = 0; i < 4-1; i++) {

    for (int i = 0; i < 4-2; i++) {

    for (int i = 0; i < 4-3; i++) {
}

 */

