package Class8;
//find the largest #
//Create an array on integers and calculate the sum of all elements in an array From an array of integer elements find the largest number.
public class T3EnhancedLoop {
    public static void main(String[] args) {

        int[] nums={10,23,25,56,45,20};

        int largest=0;
        for(int n:nums){

            if(n>largest){
                largest=n;
            }
        }
        System.out.println(largest);
    }
}
