package Class10;
//Create a car class and instantiate 3 different objects of it: Sedan, SUV, and SportsCar.
//each with specific attributes and behaviors.
public class Car {

    String make;
    String color;
    String model;
    int year;
    int price;

    void roadTrips(){
        System.out.println("This car is great for road trips!");}

    void cityDriving(){
        System.out.println("This car is great for city driving!");}


    public static void main(String[] args) {
        Car Honda = new Car();
        Honda.make = "Honda";
        Honda.model = "Civic";
        Honda.color = "Blue";
        Honda.year = 2020;
        Honda.price = 30000;

        Car Jaguar = new Car();
        Jaguar.make = "Jaguar";
        Jaguar.model = "XK8";
        Jaguar.color = "Red";
        Jaguar.year = 2998;
        Jaguar.price = 65000;

        System.out.println(Honda.make);
        System.out.println(Honda.model);
        System.out.println(Honda.color);
        System.out.println(Honda.year);
        System.out.println(Honda.price);
        Honda.roadTrips();
        System.out.println("========================");
        System.out.println(Jaguar.make);
        System.out.println(Jaguar.model);
        System.out.println(Jaguar.color);
        System.out.println(Jaguar.year);
        System.out.println(Jaguar.price);
        Honda.cityDriving();
    }
    }