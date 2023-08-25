package Class10;

public class E9StringDemo {
    public static void main(String[] args) {

        String str="Today is a Java class";
        System.out.println(str.startsWith("T"));  //false with lowercase t
        System.out.println(str.startsWith("  Today")); //false with spacing
        System.out.println(str.endsWith("s"));
        System.out.println(str.endsWith("class")); //Class would be false
    }
}
