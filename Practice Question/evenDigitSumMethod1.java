//WAP to calculate the sum of even digits in the number.

public class evenDigitSumMethod1 {
    int EvenDigitSumMethod1(int num){
        int sum=0;
        while(num>0){
            int rem=num % 10;
            num=num / 10;
            if(rem % 2==0){
                sum=sum+rem;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        evenDigitSumMethod1 obj = new evenDigitSumMethod1();
        int num = 12345678;
        int result = obj.EvenDigitSumMethod1(num);
        System.out.println("Sum of even digits in " + num + ": " + result);
    }
}
