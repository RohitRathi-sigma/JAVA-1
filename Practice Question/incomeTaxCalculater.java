import java.util.Scanner;

public class incomeTaxCalculater{

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Input from user
        System.out.print("Enter your gender (M for Male, F for Female): ");
        char gender = s.next().charAt(0);

        System.out.print("Enter your annual income: ");
        double income = s.nextDouble();

        double tax = 0.0;

        // Tax calculation for general (male) taxpayers
        if (gender == 'M' || gender == 'm') {
            if (income <= 180000) {
                tax = 0.0;
            } else if (income <= 500000) {
                tax = (income - 180000) * 0.10;
            } else if (income <= 800000) {
                tax = (income - 500000) * 0.20 + 32000;
            } else {
                tax = (income - 800000) * 0.30 + 92000;
            }
        }
        // Tax calculation for women taxpayers
        else if (gender == 'F' || gender == 'f') {
            if (income <= 190000) {
                tax = 0.0;
            } else if (income <= 500000) {
                tax = (income - 190000) * 0.10;
            } else if (income <= 800000) {
                tax = (income - 500000) * 0.20 + 31000;
            } else {
                tax = (income - 800000) * 0.30 + 91000;
            }
        } else {
            System.out.println("Invalid gender input!");
            return;
        }

        // Output the calculated tax
        System.out.printf("Your calculated income tax is: %.2f%n", tax);
    }
}