package Class10;
//T1 - create a class "phone" create 3 objects of it: iPhone, Pixel, Samsung
// with specific attributes and behaviors.
public class Phone {

    String brand;
    String color;
    int size;
    int model;

    void buyPhone(){
        System.out.println("This version is old!");}

    void newPhone(){
            System.out.println("I want this new Samsung!");}


    public static void main(String[] args) {

        Phone iPhone=new Phone();
        iPhone.brand="iPhone";
        iPhone.color="black";
        iPhone.size=300;
        iPhone.model=2020;

        Phone Samsung=new Phone();
        Samsung.brand="Pixel";
        Samsung.color="gray";
        Samsung.size=500;
        Samsung.model=2023;


        System.out.println(iPhone.brand);
        System.out.println(iPhone.color);
        System.out.println(iPhone.size);
        System.out.println(iPhone.model);
        iPhone.buyPhone();
        System.out.println("=========================");
        System.out.println(Samsung.brand);
        System.out.println(Samsung.color);
        System.out.println(Samsung.size);
        System.out.println(Samsung.model);
        Samsung.newPhone();

    }



}
