package Class7;

public class E2NestedLoops {
    public static void main(String[] args) {

     /*   for (int i=0; i<5;i++){
            System.out.print(i+" ");
        }
      */

        for (int j=0;j<3;j++){
            for (int i=2;i<20;i=i+2){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
