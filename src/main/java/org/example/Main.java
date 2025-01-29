package org.example;
public class Main {
    public static void main(String[] args) {
    Car car = new Car(4,"String magic blue", 2,"Premium 93 octane", "Volvo" );
    car.honk();
    car.displayInfo();
    System.out.println(car.getBrand());
    }
}