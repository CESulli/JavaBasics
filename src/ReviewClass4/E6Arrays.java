package ReviewClass4;

public class E6Arrays {
    public static void main(String[] args) {
        int [] salaries={120000, 150000, 200000};
        System.out.println(salaries[1]);
        salaries[1]=160000;
        System.out.println(salaries[1]);
        salaries[3]=145000;
       // System.out.println(salaries[3]); //out of bounds, cannot make changes outside of original array

    }
}
