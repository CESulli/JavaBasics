package Class5;

public class E5OROperator {
    public static void main(String[] args) {

        boolean broughtFlowers = true;
        boolean broughtChocolates = false;
        boolean allMyMistake = true;

        if (broughtChocolates || broughtFlowers || allMyMistake) {
            System.out.println("Wife is Happy!");
        } else {
            System.out.println("Wife is Sad");
        }
    }
}
