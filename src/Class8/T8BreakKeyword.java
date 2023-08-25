package Class8;
//you have to search the array for number 45 if it is present in the array
//print found, else do nothing
public class T8BreakKeyword {
    public static void main(String[] args) {

        int[] nums = {10,23,25,56,45,20};

       for (int n:nums){
            if (n==45) {
                System.out.println("found");
                break;
            }
        }
    }
}


