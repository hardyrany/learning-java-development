// CLASS:
class Car {

    // FIELDS / ATTRIBUTES:
    // variables that define the properties of the class
    String brand;   // stores car brand name
    int year;       // stores manufacturing year
    double price;   // stores car price

    // CONSTRUCTOR
    // special method used to initialize object values
    // runs automatically when object is created
    Car(String brand, int year, double price) {
        this.brand = brand;     // assigns parameter value to class variable
        this.year = year;
        this.price = price;
    }

    // METHOD:
    // display -> print car details
    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
        System.out.println("Price: " + price);
        
        // formatted output combining all values
        System.out.println(brand  + " (" + year + ") - $" + price);
    }
}


public class OOPExample {

    // CLASS:
    // A class is a blueprint/template used to create objects
    // It defines properties (variables) and behaviors (methods)
    public static void main(String[] args) {

        // OBJECT CREATION:
        // Creating instances (objects) of the Car class
        
        Car car1 = new Car("BMW", 1994, 120000.99);
       // new -> creates a new object in memory
       // Car("BMW", 1994, 120000.99) -> calls constructor to initialize object
       
        Car car2 = new Car("Toyota", 2023, 25000.00);
        Car car3 = new Car("Mercedes", 2022, 150000.99);
        Car car4 = new Car("Honda", 2021, 16000.00);

        // METHOD CALL:
        // calling display() method to print car details

        car1.display(); // prints BMW details
        System.out.println();
        car2.display(); // prints Toyota details
        System.out.println();
        car3.display(); // prints Mercedes details
        System.out.println();
        car4.display(); // prints Honda details
    }
}
