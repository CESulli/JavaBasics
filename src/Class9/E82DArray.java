package Class9;
// more efficient way to print
public class E82DArray {
    public static void main(String[] args) {

        int[][] numbers={
                    {10, 20, 30, 40},
                    {15, 30, 35, 45},
                    {16, 20, 32, 22}};

        for(int [] row:numbers){
            for(int col:row){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
}
/*
 int[] num={10,20,30,40};

        for(int n:num){
            System.out.println(n); //how enhanced for loop works
 */