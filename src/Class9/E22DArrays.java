package Class9;

public class E22DArrays {
    public static void main(String[] args) {
        String[][] names=
                {
                        {"Hind","Mikhail","Ismael","Ahmed"},
                        {"John","Bob","Adam","Tamim"},
                        {"Nick","Clare","Giulia","Michelle"},
                        {"Uzair","Avis","Westley","Kuma"},
                };
        String[] row=names[2];
        for(String name:row){  //prints all elements from row
            System.out.println(name);
        }

        //System.out.println(row[3]);
        //System.out.println(Arrays.toString(row)); //gets all names from indexed row
        //System.out.println(names[2][2]);  //Giulia
        //System.out.println(names[1][2]);  //Tamim
    }
}
