//WAP to implement the concept of Interface and Abstract class.

interface Animal { 
    void sound();  
}

abstract class Bird implements Animal {
    void fly() {
        System.out.println("Bird is flying...");
    }
}

class Sparrow extends Bird {
    public void sound() {
        System.out.println("Sparrow is chirping...");
    }
}

public class InterfaceAndAbstractClass {
    public static void main(String[] args) {
        Sparrow sparrow = new Sparrow();
        sparrow.sound();
        sparrow.fly();
    }
}
