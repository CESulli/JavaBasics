package ReviewClass3;
//62 63 66 67 68 69 70
public class T2WhileLoop {
    public static void main(String[] args) {

        int start = 62;
        int end = 70;

        while (start <= end) {
            if (start != 64 && start != 65) {
                System.out.print(start + " ");
            }
            start++;
        }
    }
}
