package Class4;

public class HW1LoanSpecialist {

    //* You are a loan specialist and you need to ask user what is the amount of loan is needed.
    // If loan is less or equal to 200,000 then you would lend the money otherwise you would reject the client.

    public static void main(String[] args) {

        double loan=150000;
        if (loan<=200000) {
            System.out.println("Your loan has been approved!");
        } else {
            System.out.println("Sorry, you do not qualify");
        }

    }

}
