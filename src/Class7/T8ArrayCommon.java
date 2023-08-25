package Class7;

public class T8ArrayCommon {
    public static void main(String[] args) {

        int [] numbers={20,29,48,69,60};

        for (int i=0; i < numbers.length; i++) {  //i+=2 is not the best because it is picking items from even indexes
            if(numbers[i]%2==0){  //for odd use ! :: if(numbers[i}%2!=0){
            System.out.println(numbers[i]); }
        }
    }
}
