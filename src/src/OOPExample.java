// Define a class
class Car {
    // Attributes/Variables(fields)
    String brand;
    int year;
    double price;

    // Constructor
    Car(String brand, int year, double price) {
        this.brand = brand;
        this.year = year;
        this.price = price;
    }

    // Method
    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
        System.out.println("Price: " + price);
        System.out.println(brand  + " (" + year + ") - $" + price);
    }
}


public class OOPExample {
    public static void main(String[] args) {

        // Create objects
        Car car1 = new Car("BMW", 1994, 120000.99);
        Car car2 = new Car("Toyota", 2023, 25000.00);
        Car car3 = new Car("Mercedes", 2022, 150000.99);
        Car car4 = new Car("Honda", 2021, 16000.00);

        car1.display(); // BMW
        System.out.println();
        car2.display(); // Toyota
        System.out.println();
        car3.display(); // Mercedes
        System.out.println();
        car4.display(); // Honda
    }
}
