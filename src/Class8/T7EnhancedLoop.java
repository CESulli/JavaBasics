package Class8;
//go through array and replace all the neg #s with 0
public class T7EnhancedLoop {
    public static void main(String[] args) {

        int[] nums = {10, 77, 25, 56, 60, 20, -10, -5};

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] < 0) {
                nums[i] = 0;
            }
            System.out.println(nums[i]);
        }
    }
}