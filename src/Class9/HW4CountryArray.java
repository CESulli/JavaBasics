package Class9;
/*
Create 2D array of countries: north america countries, south america countries, europe countries, asian countries, african countries.
Then print all values from that array using 2 different loops and calculate how many total countries been stored.
 */
public class HW4CountryArray {
    public static void main(String[] args) {

        String[][] countries={
                {"United States","Canada","Mexico","Guadeloupe"},
                {"Peru","Colombia","Bolivia","Chile"},
                {"Taiwan","Japan","Indonesia","Philippines"},
                {"Ethiopia","Ghana","South Africa","Namibia"}};

        for (int row = 0; row < countries.length; row++) {
            for (int col = 0; col < countries[row].length; col++) {
                System.out.print(countries[row][col]+" ");
            }
            System.out.println();
        }
        int total = 0;
        for (int row = 0; row < countries.length; row++) {
            total = total + countries[row].length;
        }
        System.out.println("=====================================");
        System.out.println(total);
        }
    }

