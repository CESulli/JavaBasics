package Class7;
//Create an array of animals and store 5 elements into it. Using 2 different loops print all elements from the array.
public class HW6ArrayAnimals {
    public static void main(String[] args) {
        String[] animals={"Bird","Dog","Cat","Wolf","Lion"};

        System.out.println(animals[0]+" "+animals[1]+" "+animals[2]+" "+animals[3]+" "+animals[4]);

        for (int i=0; i<animals.length;i++){
            System.out.println(animals[i]);
        }

    }

}
