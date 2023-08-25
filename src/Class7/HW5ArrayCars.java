package Class7;
//Create an array of cars and store 6 elements into it. Using 2 different loops print all values from the array.
public class HW5ArrayCars {
    public static void main(String[] args) {
        String [] cars={"Lexus","Alfa Romeo","Mercedes","BMW","Jaguar","Tesla"};
        System.out.println(cars[0]+" "+cars[1]+" "+cars[2]+" "+cars[3]+" "+cars[4]+" "+cars[5]);

        for (int i=0;i<cars.length;i++) {
            System.out.println(cars[i]);
        }
    }
}
