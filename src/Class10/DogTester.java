package Class10;

public class DogTester {
    public static void main(String[] args) {
        //creating an object from the Dog class
        //name of java class must match name of variable
        Dog lunasObj=new Dog();
        lunasObj.name="Luna";
        lunasObj.gender='F';
        lunasObj.breed="Shiba";
        lunasObj.weight=10;
        lunasObj.age=25;
        System.out.println();
        //we are calling the bark method on lunasObj
        lunasObj.bark();
        lunasObj.eat();
        lunasObj.sleep();

    }
}
