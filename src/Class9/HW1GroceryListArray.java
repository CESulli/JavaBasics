package Class9;

/*
Using 2D array create a grocery list. Inside you should have an array of veggies, fruits, dairy and sweets.
Retrieve all values from that array using 2 different loops.
 */
public class HW1GroceryListArray {
    public static void main(String[] args) {
        String[][] names=
                {
                        {"Eggs","Butter","Cream"},
                        {"Lettuce","Avocados","Potatoes"},
                        {"Apples","Strawberries","Bananas"},
                        {"Chocolate","Marzipan","Snickers"},
                };

        for(String[] row:names){
            for(String col:row){
                System.out.print(col+" ");
            }
            System.out.println();
                }
        System.out.println("=================================");
        for(String [] row:names) {
            for (String v : row) {
                System.out.print(v + " ");
            }
            System.out.println();
        }
    }
}
