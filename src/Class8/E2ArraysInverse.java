package Class8;
//printing in reverse: 2 ways
//Create an array to store char values and then print those in reverse order
public class E2ArraysInverse {
    public static void main(String[] args) {

        char[] chars={'A','b','c','F','E','#','@'};

        for(int i=6;i>=0;i--){
            System.out.println(chars[i]);
        }
    }
}

/*
for (int i=chars.length-1;i>=0;i--){
  System.out.println(chars[i]);
        }
 */