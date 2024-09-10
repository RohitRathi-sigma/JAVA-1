//  WAP to demonstrate the concept of Method Overriding.

class Vehicle {                                   // Base class
    void move() {                                // Method in the base class
        System.out.println("The vehicle is moving");
    }
} 
class Car extends Vehicle {                     // Derived class
    void move() {                              // Overriding the move method
        System.out.println("The car is driving");
    }
}
public class MethodOverriding{                  // Main class to demonstrate method overriding
    public static void main(String[] args) {
        Vehicle myVehicle = new Vehicle();          // Create a Vehicle object
        myVehicle.move();                          // Calls the method in Vehicle class
        
        Car myCar = new Car();                    // Create a Car object
        myCar.move();                             // Calls the overridden method in Car class

        Vehicle mySecondVehicle = new Car();      // Polymorphism: Vehicle reference but Car object
        mySecondVehicle.move();                   // Calls the overridden method in Car class
    }
}
