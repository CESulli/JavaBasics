package Class4;

public class E1NestedIf {

    public static void main(String[] args) {

        boolean winter=true;
        String jacketColor="Blue";

        if(winter==true){
            System.out.println("Its very cold");
            if(jacketColor.equals("Red")) {
                System.out.println("Let's go with Red Nike shoes");
            } else {
                System.out.println("Lets go with the blue Nikes");
            }
        } else {
            System.out.println("No need to wear a jacket");
        }
    }
}
