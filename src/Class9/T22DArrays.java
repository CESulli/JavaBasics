package Class9;
//write a loop to get all the elements from second row one by one
public class T22DArrays {
    public static void main(String[] args) {
        int [][] numbers = {
                {10, 20, 30, 40, 50},
                {15, 30, 35, 45, 20},
                {16, 20, 32, 22, 30}};

        for (int row=0; row <= 4; row++){
            System.out.print(numbers[1][row]+" ");
        }
    }
}
