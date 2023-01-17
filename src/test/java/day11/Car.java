package day11;

public class Car {
    String make = "Toyota";
    String model = "Prius";
    int year = 2020;
    int price = 30000;


    public Car() {
        System.out.println("Car constructur 1");
    }


    public Car(String make, String model, int year, int price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;


    }
}