package Class5;

public class E8ANDOperator {

    //if not all meet true, then it is false
    public static void main(String[] args) {

        boolean goodCredit=true;
        boolean stableJob=true;
        boolean minimumAge=false;
        if(goodCredit&&stableJob&&minimumAge){
            System.out.println("You can have the loan");
        }else {
            System.out.println("You need to fulfill the requirements");
        }

    }

}
