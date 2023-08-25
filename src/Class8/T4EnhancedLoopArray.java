package Class8;
//print all the even numbers one by one from this array using enhanced for loop
public class T4EnhancedLoopArray {
    public static void main(String[] args) {

        int[] nums={10,23,25,56,45,20};

        for(int n:nums){

            if(n%2==0){
                System.out.println(n);
            }
        }
    }
}
