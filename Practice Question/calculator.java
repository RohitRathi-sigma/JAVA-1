//Create a class called Calculator which has different add methods. Overload the methods with different paramete.

public class calculator {

    public int add(int a, int b) {            // add two integers
        return a + b;
    }
    public int add(int a, int b, int c) {      // add two integers
        return a + b + c;
    }

    public double add(double a, double b) {    // add two double values
        return a + b;
    }

    public int add(int[] numbers) {           // add an array of integers
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    public double add(double[] numbers) {     // add an array of double values
        double sum = 0; 
        for (double num : numbers) {
            sum += num;
        }
        return sum;
    }
    
    public static void main(String[] args) {
        calculator calc = new calculator();

         // overloaded methods
        System.out.println("Sum of two integer value:" +calc.add(2, 3));
        System.out.println("Sum of three integer value:" +calc.add(2, 3, 5));
        System.out.println("Sum of double value:" +calc.add(2.5, 3.5)); 
        System.out.println("Sum of array of integers:" +calc.add(new int[]{1, 2, 3, 4}));
        System.out.println("Sum of array of double value:"+calc.add(new double[]{1.5, 2.5, 3.5}));
    }
}
