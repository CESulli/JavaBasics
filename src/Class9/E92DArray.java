package Class9;
// simpler way to print all
public class E92DArray {
    public static void main(String[] args) {
        String[][] names=
                {
                        {"Hind","Mikhail","Ismael","Ahmed"},
                        {"John","Bob","Adam","Tamim"},
                        {"Nick","Clare","Giulia","Michelle"},
                        {"Uzair","Avis","Westley","Kuma"},
                };

        for(String [] row:names) {
            for (String v : row) {
                System.out.print(v + " ");
            }
            System.out.println();
        }
    }
}
