package Class7;

public class E10Arrays {
    public static void main(String[] args) {
        // creating the array and also initializing it
        String [] fruit={"Apple","Orange","Banana","Kiwi","Dates"};

        fruit [3]="Mango";

        for (int i=0;i<fruit.length;i++) {
            System.out.println(fruit[i]);  //gives us the name of all the items in the array

        }
    }
}
