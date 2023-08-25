package Class7;
// add all the numbers from the array and print the sum at the end
public class T9ArrayConcat {
    public static void main(String[] args) {

        int [] numbers={20,10,50,30,40};  //150

        for (int i=0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println("The sum is "+(numbers[0]+numbers[1]+numbers[2]+numbers[3]+numbers[4]));


        /* or
        int [] numbers={20,10,50,30,40};
        int sum=0;
        for (int i=0; i <numbers.length; i++) {
            sum=sum+numbers[i];  //pick the previous value of sum and add it to the current value of array
            }
            System.out.println(sum)
         */
    }
}
