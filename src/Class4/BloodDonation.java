package Class4;

public class BloodDonation {

    public static void main(String[] args) {

        int age=17;
        int weight=125;

        if (age>=18) {
            System.out.println("Eligible!");
            if (weight >= 110) {
                System.out.println("Patient can donate!");
            } else {
                System.out.println("Patient can not donate!");
            }
        }else {
            System.out.println("Uneligible");
        }

    }
}
