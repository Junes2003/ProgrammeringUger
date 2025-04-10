package Uge8;

public class Car {

    String brand;
    int year;

    Person owner;

    @Override
    public String toString() {
    return "Car{" +
        "brand='" + brand + '\'' +
        ", year=" + year +
        ", owner=" + owner +
        '}';
    }

    // Konstruktør
    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    // toString-metode

}

