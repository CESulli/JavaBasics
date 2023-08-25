package Class6;

//print only odd numbers from 100 to 1 (2 different ways)
public class T10OddNumFor {
    public static void main(String[] args) {

        //for (int i = 99; i>1; i-=2){
        //System.out.print(i+" ");


        int i=100;
        while (i>=1){
            i--;
            System.out.println(i);
            i--;
        }
    }
}
