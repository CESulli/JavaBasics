package Class9;

public class E12DArrays {
    public static void main(String[] args) {
        String[][] names=
                {
                        {"Hind","Mikhail","Ismael","Ahmed"},
                        {"John","Bob","Adam","Tamim"},
                        {"Nick","Clare","Giulia","Michelle"},
                        {"Uzair","Avis","Westley","Kuma"},
                };
        System.out.println(names[2][2]);  //Giulia
        System.out.println(names[1][2]);  //Tamim
    }
}
/* prints all arrays
 for(String [] row:names){
            System.out.println(Arrays.toString(row));
 */

/* simpler way to print all

        for(String [] row:names) {
            for (String v : row) {
                System.out.print(v + " ");
            }
            System.out.println();
        }
 */