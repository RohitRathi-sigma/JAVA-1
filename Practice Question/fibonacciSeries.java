//WAP to Fibonacci series.

import java.util.Scanner;
public class fibonacciSeries{
    public static void main(String[] args) {
        System.out.println("Enter the number of terms:");
        Scanner S=new Scanner(System.in);
        int n=S.nextInt();
        int a=0;
        int b=1;
        System.out.println("Fibonacci series"+a+" "+b+" ");
        for(int i=2;i<n;i++){
            int temp=a+b;
            System.out.print(temp+" ");
            a=b;
            b=temp;
        }
    }
 }