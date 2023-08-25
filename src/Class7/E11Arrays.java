package Class7;
//second way to create arrays in java
public class E11Arrays {
    public static void main(String[] args) {
        // only creating the array - empty array that contains 00 for every item rn, we have reserved slots
        int [] prices= new int[5]; //specify how many items you are storing here --it's a MUST!
        prices[0]=1000;
        prices[2]=250;

        System.out.println(prices[2]);

    }
}
