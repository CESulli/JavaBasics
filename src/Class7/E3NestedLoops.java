package Class7;

public class E3NestedLoops {
    public static void main(String[] args) {

       /* int x=1;
        while (x<=5){
            System.out.print("#"); //infinite unless adding x++
            x++;
        } */

        int y = 1;
        while (y <= 3) {

            int x = 1;
            while (x <= 10) {
                System.out.print("=");
                x++;
            }
            System.out.println();
            y++;
        }
    }
}

