//. Demonstrate the concept of user defined Package using following scenario: Create a new project in which create a package named org.animals. In that create various classes like Lion, Monkey, Elephant. In each class create data members like color, weight and age. Create methods like is Vegetarian, canClimb, getSound. Create another project and in that create a package called zoo and create a class called VandalurZoo and create objects for the animals that are existing in zoo and print the characteristic of each animal.

public class Main {
    public static void main(String[] args) {
        Lion lion = new Lion("Golden", 190, 5);
        Monkey monkey = new Monkey("Brown", 35, 3);
        Elephant elephant = new Elephant("Grey", 1200, 10);

        System.out.println("Characteristics of Animals in Vandalur Zoo:");

        lion.displayInfo();
        System.out.println();
        monkey.displayInfo();
        System.out.println();
        elephant.displayInfo();
    }
}

class Lion {
    private String color;
    private int weight;
    private int age;

    public Lion(String color, int weight, int age) {
        this.color = color;
        this.weight = weight;
        this.age = age;
    }

    public boolean isVegetarian() {
        return false;
    }

    public boolean canClimb() {
        return false;
    }

    public String getSound() {
        return "Roar";
    }

    public void displayInfo() {
        System.out.println("Lion [Color: " + color + ", Weight: " + weight + "kg, Age: " + age + " years]");
        System.out.println("Is Vegetarian? " + isVegetarian());
        System.out.println("Can Climb? " + canClimb());
        System.out.println("Sound: " + getSound());
    }
}

class Monkey {
    private String color;
    private int weight;
    private int age;

    public Monkey(String color, int weight, int age) {
        this.color = color;
        this.weight = weight;
        this.age = age;
    }

    public boolean isVegetarian() {
        return true;
    }

    public boolean canClimb() {
        return true;
    }

    public String getSound() {
        return "Chatter";
    }

    public void displayInfo() {
        System.out.println("Monkey [Color: " + color + ", Weight: " + weight + "kg, Age: " + age + " years]");
        System.out.println("Is Vegetarian? " + isVegetarian());
        System.out.println("Can Climb? " + canClimb());
        System.out.println("Sound: " + getSound());
    }
}

class Elephant {
    private String color;
    private int weight;
    private int age;

    public Elephant(String color, int weight, int age) {
        this.color = color;
        this.weight = weight;
        this.age = age;
    }

    public boolean isVegetarian() {
        return true;
    }

    public boolean canClimb() {
        return false;
    }

    public String getSound() {
        return "Trumpet";
    }

    public void displayInfo() {
        System.out.println("Elephant [Color: " + color + ", Weight: " + weight + "kg, Age: " + age + " years]");
        System.out.println("Is Vegetarian? " + isVegetarian());
        System.out.println("Can Climb? " + canClimb());
        System.out.println("Sound: " + getSound());
    }
}
