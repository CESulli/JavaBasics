package Class8;
//find the largest EVEN #
public class T5EnhancedLoopEven {
    public static void main(String[] args) {

        int[] nums={10,77,25,56,60,20};

        int largest=nums[0];
        for(int n:nums){

            if(n>largest && n%2==0){
                largest=n;
            }
        }
        System.out.println(largest);
    }
}
