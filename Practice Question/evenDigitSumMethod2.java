//WAP to calculate the sum of even digits in the number.

public class evenDigitSumMethod2 {
    public int evenDigitSum(int num) {
        String str = Integer.toString(num);
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            int digit = Character.getNumericValue(str.charAt(i));
            if (digit % 2 == 0) {
                sum += digit;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        evenDigitSumMethod2 obj = new evenDigitSumMethod2();
        int result = obj.evenDigitSum(1234567890); // Example input
        System.out.println("Sum of even digits: " + result);
    }
}
